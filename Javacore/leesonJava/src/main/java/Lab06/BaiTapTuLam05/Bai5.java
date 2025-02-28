package Lab06.BaiTapTuLam05;

import java.util.Scanner;

public class Bai5 {
    private int n;
    private int arr[];

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // Hàm kiểm tra số nguyên tố
    public boolean isPrime(int num) {
        if (num < 2) return false; // Số nhỏ hơn 2 không phải số nguyên tố
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // Nếu chia hết thì không phải số nguyên tố
        }
        return true; // Nếu không chia hết cho số nào => là số nguyên tố
    }

    // Hàm kiểm tra từng số trong mảng
    public void checkPrime() {
        System.out.println("Các số nguyên tố trong mảng:");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có số nguyên tố nào trong mảng.");
        }
    }

    public static void main(String[] args) {
        Bai5 b = new Bai5();
        b.input();
        b.checkPrime();
    }
}
