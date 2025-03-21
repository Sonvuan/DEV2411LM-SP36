document.addEventListener("DOMContentLoaded", function () {
    function updateEditorSelection() {
        let authorCheckboxes = document.querySelectorAll(".author-checkbox");
        let editorRadios = document.querySelectorAll(".editor-radio");
        let selectedAuthors = [];

        authorCheckboxes.forEach((checkbox, index) => {
            if (checkbox.checked) {
                selectedAuthors.push(editorRadios[index]);
                editorRadios[index].disabled = false;
            } else {
                editorRadios[index].disabled = true;
                editorRadios[index].checked = false;
            }
        });

        if (selectedAuthors.length > 0) {
            selectedAuthors[0].checked = true; // Chọn mặc định nếu chưa có chủ biên
        }
    }

    // Thêm sự kiện khi submit form
    document.querySelector("form").addEventListener("submit", function (e) {
        let selectedAuthors = document.querySelectorAll("input[name='authorIds']:checked");
        if (selectedAuthors.length === 0) {
            alert("Bạn phải chọn ít nhất một tác giả!");
            e.preventDefault(); // Ngăn form gửi đi nếu không có tác giả nào được chọn
        }
    });

    // Đặt `updateEditorSelection()` thành function toàn cục
    window.updateEditorSelection = updateEditorSelection;

    // Gọi hàm để cập nhật trạng thái ban đầu
    updateEditorSelection();
});
