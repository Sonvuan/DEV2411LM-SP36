package Lab05.BaiTapTuLam.VietNam;

import Lab05.BaiTapTuLam.Product.Product;
import Lab05.BaiTapTuLam.ThaiLand.ThaiLandImportPrice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Lớp GeneralManager quản lý sản phẩm nhập khẩu từ Việt Nam và Thái Lan.
 */
public class GeneralManager {
    private ArrayList<Product> vietNamProducts = new ArrayList<>();
    private ArrayList<Product> thaiLandProducts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    /**
     * Nhập danh sách sản phẩm từ Việt Nam.
     */
    public void inputVietNamProducts() {
        System.out.print("Nhập số lượng sản phẩm Việt Nam: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm thứ " + (i + 1) + ":");
            System.out.print("Product ID: ");
            String prodId = sc.nextLine();
            System.out.print("Product Name: ");
            String prodName = sc.nextLine();
            System.out.print("Manufacturer: ");
            String manufacturer = sc.nextLine();
            System.out.print("Producer Price: ");
            float producerPrice = sc.nextFloat();
            System.out.print("Thuế Nhập Khẩu: ");
            float taxImported = sc.nextFloat();
            sc.nextLine();

            vietNamProducts.add(new VietNamImportPrice(prodId, prodName, manufacturer, producerPrice, taxImported));
        }
    }

    /**
     * Nhập danh sách sản phẩm từ Thái Lan.
     */
    public void inputThaiLandProducts() {
        System.out.print("Nhập số lượng sản phẩm Thái Lan: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm thứ " + (i + 1) + ":");
            System.out.print("Product ID: ");
            String prodId = sc.nextLine();
            System.out.print("Product Name: ");
            String prodName = sc.nextLine();
            System.out.print("Manufacturer: ");
            String manufacturer = sc.nextLine();
            System.out.print("Producer Price: ");
            float producerPrice = sc.nextFloat();
            System.out.print("Thuế Nhập Khẩu: ");
            float taxImported = sc.nextFloat();
            System.out.print("Giá Hỗ Trợ Nhập Khẩu: ");
            float importPriceSupport = sc.nextFloat();
            sc.nextLine();

            thaiLandProducts.add(new ThaiLandImportPrice(prodId, prodName, manufacturer, producerPrice, taxImported, importPriceSupport));
        }
    }

    /**
     * Hiển thị danh sách sản phẩm của cả Việt Nam và Thái Lan.
     */
    public void displayProducts() {
        System.out.println("\nDanh sách sản phẩm Việt Nam:");
        for (Product p : vietNamProducts) {
            p.display();
            System.out.println("-----------------");
        }

        System.out.println("\nDanh sách sản phẩm Thái Lan:");
        for (Product p : thaiLandProducts) {
            p.display();
            System.out.println("-----------------");
        }
    }

    /**
     * Sắp xếp danh sách sản phẩm theo tên.
     */
    public void sortByName() {
        Collections.sort(vietNamProducts, Comparator.comparing(Product::getProdName));
        Collections.sort(thaiLandProducts, Comparator.comparing(Product::getProdName));
        System.out.println("\nSắp xếp thành công!");
    }

    /**
     * Chạy chương trình quản lý sản phẩm với menu tùy chọn.
     */
    public void run() {
        int choice;
        do {
            System.out.println("\n1. Nhập sản phẩm Việt Nam");
            System.out.println("2. Nhập sản phẩm Thái Lan");
            System.out.println("3. Hiển thị sản phẩm");
            System.out.println("4. Sắp xếp theo tên");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: inputVietNamProducts(); break;
                case 2: inputThaiLandProducts(); break;
                case 3: displayProducts(); break;
                case 4: sortByName(); break;
                case 5: System.out.println("Thoát chương trình."); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }
}
