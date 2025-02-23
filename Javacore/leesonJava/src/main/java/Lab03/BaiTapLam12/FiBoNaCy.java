package Lab03.BaiTapLam12;

import java.util.Scanner;

public class FiBoNaCy {
    private int n;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = sc.nextInt();
        sc.close();
    }
    public void display(){
        int a = 0, b = 1, next;

        System.out.println("Dãy Fibonacci có " + n + " số:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // In số hiện tại
            next = a + b; // Tính số Fibonacci tiếp theo
            a = b; // Cập nhật giá trị a
            b = next; // Cập nhật giá trị b
        }
        System.out.println(); // Xuống dòng sau khi in xong
    }
    public static void main(String[] args) {
        FiBoNaCy fib = new FiBoNaCy();
        fib.input();
        fib.display();
    }
}
