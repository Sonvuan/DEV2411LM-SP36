package Lab03.BaiTapLam10;

import java.util.Scanner;

public class KiemTraSoHoanHao {
    private int n;

    // Nhập số n từ bàn phím
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        sc.close(); // Đóng Scanner để tránh rò rỉ bộ nhớ
    }

    // Kiểm tra số hoàn hảo và xuất kết quả
    public void output() {
        int sum = 0;

        // Tìm tổng các ước số thực sự của n (không tính n)
        for (int i = 1; i < n; i++) {
            if (n % i == 0) { // i là ước số của n
                sum += i;
            }
        }

        // Kiểm tra điều kiện số hoàn hảo
        if (sum == n) {
            System.out.println(n + " là số hoàn hảo.");
        } else {
            System.out.println(n + " không phải là số hoàn hảo.");
        }
    }

    public static void main(String[] args) {
        KiemTraSoHoanHao k = new KiemTraSoHoanHao();
        k.input();
        k.output();
    }
}
