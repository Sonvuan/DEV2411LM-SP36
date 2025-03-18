package com.devmaster.lesson08.controller;

import com.devmaster.lesson08.entity.Author;
import com.devmaster.lesson08.entity.Book;
import com.devmaster.lesson08.service.AuthorService;
import com.devmaster.lesson08.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;

    private static final String UPLOAD_DIR = "src/main/resources/static/";
    private static final String UPLOAD_PathFile="images/products/";

    // hiển thị toàn bộ danh sách
    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books/book-list";
    }

    // thêm mới sách
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("authors", authorService.findAll());
        return "books/book-form";
    }

    /**
     * Xử lý thêm mới sách, bao gồm lưu thông tin sách, lưu ảnh lên server và liên kết với tác giả.
     *
     * @param book      Đối tượng Book nhận từ form, chứa thông tin sách.
     * @param authorIds Danh sách ID của các tác giả được chọn từ form.
     * @param imageFile Ảnh sách được tải lên từ form.
     * @return Chuyển hướng về trang danh sách sách sau khi lưu thành công.
     */
    @PostMapping("/new")
    public String saveBook(@ModelAttribute("book") Book book,
                           @RequestParam List<Long> authorIds,
                           @RequestParam("imageBook") MultipartFile imageFile) {
        // Kiểm tra nếu có ảnh được tải lên
        if (!imageFile.isEmpty()) {
            try {
                // Tạo đường dẫn thư mục lưu ảnh
                Path uploadPath = Paths.get(UPLOAD_DIR + UPLOAD_PathFile);

                // Nếu thư mục chưa tồn tại, tạo mới
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }

                // Lấy tên file gốc và phần mở rộng
                String originalFileName = StringUtils.cleanPath(imageFile.getOriginalFilename());
                String fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));

                // Tạo tên file mới dựa trên mã sách
                String newFileName = book.getCode() + fileExtension;
                Path filePath = uploadPath.resolve(newFileName);

                // Lưu file ảnh vào thư mục
                Files.copy(imageFile.getInputStream(), filePath);

                // Lưu đường dẫn ảnh vào thuộc tính imgUrl của sách
                book.setImgUrl("/" + UPLOAD_PathFile + newFileName);
            } catch (IOException e) {
                e.printStackTrace(); // Ghi log lỗi nếu có
            }
        }

        // Lấy danh sách tác giả theo ID và gán vào sách
        List<Author> authors = new ArrayList<>(authorService.findAllById(authorIds));
        book.setAuthors(authors);

        // Lưu sách vào database
        bookService.saveBook(book);

        // Chuyển hướng về danh sách sách
        return "redirect:/books";
    }


    // Form sửa thông tin sách
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        model.addAttribute("authors", authorService.findAll());
        return "books/book-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }
}
