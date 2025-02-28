package Lab06.BaiTapTuLam08;

import java.util.Scanner;

public class SelectionSort {
    private int n;
    private int[] arr;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }
    }

    public void selectionSort() {
        int minIndex;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Cập nhật vị trí phần tử nhỏ nhất
                }
            }
            // Hoán đổi arr[i] và arr[minIndex]
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public void output() {
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        sorter.input();
        sorter.selectionSort();
        sorter.output();
    }
}
