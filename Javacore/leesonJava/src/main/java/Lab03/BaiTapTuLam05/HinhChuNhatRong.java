package Lab03.BaiTapTuLam05;

import java.util.Scanner;

public class HinhChuNhatRong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        int w = sc.nextInt();

        for (int i = 1; i <= 5; i++) { // Duyệt từng dòng
            for (int j = 1; j <= w; j++) { // Duyệt từng cột trong dòng
                if (i == 1 || i == 5 || j == 1 || j == w) {
                    System.out.print("*"); // Viền ngoài
                } else {
                    System.out.print(" "); // Bên trong rỗng
                }
            }
            System.out.println();
        }
    }
}
