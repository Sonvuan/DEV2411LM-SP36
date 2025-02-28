package Lab06.BaiTapTuLam02;

import java.util.Random;

public class Bai2 {
    private int[] arr = new int[10]; // Mảng toàn cục

    public void input() {
        Random rand = new Random(); // Đối tượng Random để tạo số ngẫu nhiên

        // Nhập mảng ngẫu nhiên
        System.out.println("Nhập 10 số nguyên ngẫu nhiên:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100); // Sinh số ngẫu nhiên từ 0 đến 99
            System.out.println("Phần tử thứ " + (i + 1) + ": " + arr[i]);
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
        Bai2 obj = new Bai2();
        obj.input(); // Gọi phương thức nhập tự động
        obj.output(); // Gọi phương thức xuất
    }
}
