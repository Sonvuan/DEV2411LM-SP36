package Lab06.BaiTapTuLam03;

import java.util.Scanner;

public class Bai3 {
    private int n;
    private int[] arr; // Khai báo mảng mà chưa cấp phát bộ nhớ

    public void input() {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Enter no. of elements in the array: ");
        n = sc.nextInt(); // Cập nhật `n`

        arr = new int[n]; // Khởi tạo mảng sau khi biết `n`

        // Nhập các phần tử của mảng
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public void output() {
        // Hiển thị mảng đã nhập
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Bai3 obj = new Bai3();
        obj.input();  // Gọi phương thức nhập dữ liệu
        obj.output(); // Gọi phương thức xuất dữ liệu
    }
}
