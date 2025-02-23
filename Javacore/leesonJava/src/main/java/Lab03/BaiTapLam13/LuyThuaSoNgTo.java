package Lab03.BaiTapLam13;

import java.util.Scanner;

public class LuyThuaSoNgTo {
    private int n;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        n = sc.nextInt();
        sc.close();
    }

    public void output() {
        System.out.println("Lũy thừa của các số nguyên tố từ 2 đến " + n + ":");

        for (int i = 2; i <= n; i++) {  // Lặp qua các số từ 2 đến n
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) { // Kiểm tra số nguyên tố
                if (i % j == 0) {
                    isPrime = false;
                    break; // Nếu tìm thấy ước số, thoát vòng lặp sớm
                }
            }

            if (isPrime) { // Nếu i là số nguyên tố, in ra lũy thừa
                System.out.println(i + "^2 = " + (i * i));
            }
        }
    }

    public static void main(String[] args) {
        LuyThuaSoNgTo t = new LuyThuaSoNgTo();
        t.input();
        t.output();
    }
}
