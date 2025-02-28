package Lab06.BaiTapTuLam01;

import java.util.Scanner;

public class Bai1 {
    private int[] arr = new int[10]; // Biến mảng toàn cục

    public void input() {
        Scanner sc = new Scanner(System.in);

        // Nhập mảng
        System.out.println("Enter 10 số nguyên:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public void output() {
        // Hiển thị mảng
        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Xuống dòng sau khi in
    }

    public static void main(String[] args) {
        Bai1 obj = new Bai1();
        obj.input(); // Gọi phương thức nhập
        obj.output(); // Gọi phương thức xuất
    }
}
