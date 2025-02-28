package Lab06.BaiTapTuLam06;

import java.util.Scanner;

public class Bai6SoHoanhao {
    private int n;
    private int arr[];

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // Kiểm tra số hoàn hảo
    public boolean isPerfectNumber(int num) {
        if (num < 2) return false; // Số nhỏ hơn 2 không thể là số hoàn hảo
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) { // Chỉ kiểm tra đến num/2 để tối ưu
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    // Kiểm tra số hoàn hảo trong mảng
    public void checkPerfectNumbers() {
        System.out.println("Các số hoàn hảo trong mảng:");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (isPerfectNumber(arr[i])) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có số hoàn hảo trong mảng.");
        }
    }

    public static void main(String[] args) {
        Bai6SoHoanhao b = new Bai6SoHoanhao();
        b.input();
        b.checkPerfectNumbers();
    }
}
