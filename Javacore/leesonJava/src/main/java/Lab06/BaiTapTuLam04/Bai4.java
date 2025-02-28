package Lab06.BaiTapTuLam04;

import java.util.Scanner;

public class Bai4 {
    private int n;
    private int arr[];

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        n = sc.nextInt();
        arr = new int[n];

        // Nhập các phần tử
        for(int i = 0; i < n; i++){
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public void output(){
        // Tìm số lớn nhất và nhỏ nhất
        int max = arr[0], min = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] > max) {
                max = arr[i]; // Cập nhật số lớn nhất
            }
            if(arr[i] < min) {
                min = arr[i]; // Cập nhật số nhỏ nhất
            }
        }

        System.out.println("Số lớn nhất trong mảng: " + max);
        System.out.println("Số nhỏ nhất trong mảng: " + min);
    }

    public static void main(String[] args) {
        Bai4 b = new Bai4();
        b.input();
        b.output();
    }
}
