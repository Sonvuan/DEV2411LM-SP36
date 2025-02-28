package Lab07.BaiTapTuLam02;

import Lab07.BaiTapTuLam01.City;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FlowerTest {
    private ArrayList<Flower> flowers = new ArrayList<Flower>();
    private Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("Nhập số lượng hoa: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Hoa thứ " + (i+1) + ": ");
            Flower fl = new Flower();
            fl.input();
            flowers.add(fl);
        }
    }

    public void output(){
        System.out.print("Danh Sách Hoa:");
        for(int i=0; i<flowers.size(); i++){
            System.out.print("\nHoa thứ " + (i+1) + ": ");
            flowers.get(i).output();
        }
    }

    public void sortByName(){
        Collections.sort(flowers, Comparator.comparing(Flower::getFlowerName));
        System.out.println("Bạn đã sắp xếp thành công");
    }

    public void searchById(){
        System.out.print("Nhập mã hoa cần tìm: ");
        String searchId = sc.nextLine();
        boolean found = false;

        for (Flower flower : flowers) {
            if (flower.getFlowerID().equalsIgnoreCase(searchId)) {
                System.out.println("\nThông tin thành phố tìm thấy:");
                flower.output();
                found = true;
                break; // Dừng tìm kiếm sau khi tìm thấy
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy hoa có mã: " + searchId);
        }
    }

    public void displayColor(){
        boolean found = false;

        for (Flower flower : flowers) {
            if (flower.getColor().equalsIgnoreCase("Trắng")) {
                flower.output();
                found = true;

            }
        }
        if (!found) {
            System.out.println("Không tìm thấy hoa có màu trắng:");
        }
    }

    public void run() {
        int choice;
        do {
            System.out.println("\n1. Nhập thông tin Hoa");
            System.out.println("2. Hiển thị thông tin vừa nhập");
            System.out.println("3. Sắp xếp thông tin tăng dần theo tên hoa");
            System.out.println("4. Tìm kiếm thông tin theo flowerId");
            System.out.println("5. Hiển thị tất cả các loại hoa màu trắng");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: input(); break;
                case 2: output(); break;
                case 3: sortByName(); break;
                case 4: searchById(); break;
                case 5: displayColor(); break;
                case 6: System.out.println("Thoát chương trình."); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }
}
