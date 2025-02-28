package Lab06.BaiTapTuLam09;

import java.util.Scanner;

public class BubbleSort {
    private int n;
    private int[] arr;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ"+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

    }
    public void bubbleSort(){
        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j >i; j--) {
                if (arr[j] <arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
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
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.input();
        bubbleSort.bubbleSort();
        bubbleSort.output();
    }
}
