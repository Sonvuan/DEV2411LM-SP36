package Lab03.BaiTapLam09;

import java.util.Scanner;

public class Menu {
    private int n;
    public void input(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Cuối Tuần Bạn Làm gì?");
            System.out.println("1.Đi học Java");
            System.out.println("2.Đi chơi công viên ngắm gấu");
            System.out.println("3.Đi về nhà nghỉ");
            System.out.println("4.Ra sông hồng tắm tiên");
            System.out.println("5.Ngủ cả ngày");
            System.out.println("6.Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            n = sc.nextInt();
            menu(); // menu de xuly lua chon
        }while(n!=6);
    }

    public void menu() {
        switch (n) {
            case 1:
                System.out.println("Bạn đã chọn: Đi học Java. \n");
                break;
            case 2:
                System.out.println("Bạn đã chọn: Đi chơi công viên ngắm gấu.\n");
                break;
            case 3:
                System.out.println("Bạn đã chọn: Đi về nhà nghỉ.");
                break;
            case 4:
                System.out.println("Bạn đã chọn: Ra sông Hồng tắm tiên.\n");
                break;
            case 5:
                System.out.println("Bạn đã chọn: Ngủ cả ngày.\n");
                break;
            case 6:
                break;
            default:
                System.out.println("Lỗi! Vui lòng nhập số từ 1 đến 6.");
                break;
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.input();
        menu.menu();
    }
}
