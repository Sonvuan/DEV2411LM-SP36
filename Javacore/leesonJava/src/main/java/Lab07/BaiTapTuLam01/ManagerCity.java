package Lab07.BaiTapTuLam01;

import Lab05.BaiTapTuLam.Product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerCity {
    // khai báo arraylist lưu trữ thông tin
    private ArrayList<City> cities =  new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    /**
     * Nhập số lượng thành phố
     * sử dụng vòng for để nhập thông tin thành phố
     */
    public void input(){
        System.out.println("Nhập số lượng thành phố: ");
        int n = input.nextInt();
        input.nextLine();


        for (int i = 0; i < n; i++) {
            System.out.println("thành phố thứ " +(i+1));
            City city = new City();
            city.input();
            cities.add(city);
        }
    }

    /**
     * hiển thị thông tin thành phố
     * Sử dụng vòng for để hiển thị thông tin thành phố
     */
    public void output() {
        System.out.println("Danh sách các thành phố:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("\nThành phố thứ " + (i + 1) + ":");
            cities.get(i).display();
        }
    }

    /**
     * Sắp xếp các thành phố từ theo tên chữ cái
     */
    public void sortByName() {
        Collections.sort(cities, Comparator.comparing(City::getCityName));
        System.out.println("\nSắp xếp thành công!");
    }

    /**
     * tìm kiếm thành phố theo mã id thành phố
     * dùng foreach để hiện thị thông tin thành phố theo mã id vừa tìm kiếm
     */
    public void searchById() {
        System.out.print("Nhập mã thành phố cần tìm: ");
        String searchId = input.nextLine();
        boolean found = false;

        for (City city : cities) {
            if (city.getCityId().equalsIgnoreCase(searchId)) {
                System.out.println("\nThông tin thành phố tìm thấy:");
                city.display();
                found = true;
                break; // Dừng tìm kiếm sau khi tìm thấy
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy thành phố có mã: " + searchId);
        }
    }

    public void run() {
        int choice;
        do {
            System.out.println("\n1. Nhập thông tin thành phố");
            System.out.println("2. Hiển thị thông tin vừa nhập");
            System.out.println("3. Sắp xếp thông tin tăng dần theo tên nước");
            System.out.println("4. Tìm kiếm thông tin theo cityId");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1: input(); break;
                case 2: output(); break;
                case 3: sortByName(); break;
                case 4: searchById(); break;
                case 5: System.out.println("Thoát chương trình."); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }

}
