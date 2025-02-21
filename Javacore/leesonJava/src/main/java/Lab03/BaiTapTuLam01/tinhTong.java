package Lab03.BaiTapTuLam01;

import java.util.Scanner;

public class tinhTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=1;i<=100;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
