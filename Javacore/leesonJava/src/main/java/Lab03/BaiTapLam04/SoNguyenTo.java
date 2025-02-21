package Lab03.BaiTapLam04;

import java.util.Scanner;

public class SoNguyenTo {
    private int a;

    // Hàm nhập số nguyên
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        a = sc.nextInt();
    }
    public boolean isPrime(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    public void checkPrime() {
        if (isPrime(a)) {
            System.out.println(a + " là số nguyên tố.");
        } else {
            System.out.println(a + " không phải là số nguyên tố.");
        }
    }

    public static void main(String[] args) {
        SoNguyenTo snt = new SoNguyenTo();
        snt.input();
        snt.checkPrime();
    }
}
