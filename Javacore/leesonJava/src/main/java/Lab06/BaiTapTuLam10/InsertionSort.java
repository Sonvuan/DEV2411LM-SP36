package Lab06.BaiTapTuLam10;

import java.util.Scanner;

public class InsertionSort {
    private int n;
    private int[] arr;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }
    public void insertionSort(){
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;

            }
            arr[j+1] = key;
        }
    }
    public void output(){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        sort.input();
        sort.insertionSort();
        sort.output();

    }
}
