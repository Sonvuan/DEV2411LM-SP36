package Lab06.BaiTapTuLam07;

import java.util.Scanner;

public class inRaSoChan {
    private int n;
    private int arr [];

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public void output(){
        for (int i = 0; i < n; i++) {
            if(arr[i] %2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        inRaSoChan obj = new inRaSoChan();
        obj.input();
        obj.output();
    }
}
