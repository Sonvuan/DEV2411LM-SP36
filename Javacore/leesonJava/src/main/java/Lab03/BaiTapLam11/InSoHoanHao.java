package Lab03.BaiTapLam11;

import java.util.Scanner;

public class InSoHoanHao {
    private int n;

    // Nhập số n từ bàn phím
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
    }

    // Hàm tìm và in tất cả số hoàn hảo từ 1 đến n
    public void printPerfectNumbers() {
        System.out.println("Các số hoàn hảo từ 1 đến " + n + ":");

        boolean found = false; // Biến kiểm tra xem có số hoàn hảo nào không

        // Vòng lặp kiểm tra từng số từ 1 đến n
        for (int i = 1; i <= n; i++) {
            int sum = 0; // Tổng các ước số

            // Vòng lặp tìm tổng các ước số thực sự của i
            for (int j = 1; j < i; j++) {
                if (i % j == 0) { // Nếu j là ước số của i
                    sum += j;
                }
            }

            // Nếu tổng các ước số bằng i thì i là số hoàn hảo
            if (sum == i) {
                System.out.print(i + " "); // In số hoàn hảo trên cùng một dòng
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có số hoàn hảo nào trong khoảng này.");
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InSoHoanHao k = new InSoHoanHao();
        k.input();
        k.printPerfectNumbers();
    }
}
