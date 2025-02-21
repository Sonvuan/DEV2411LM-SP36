package Lab03.BaiTapTuLam03;

import java.util.Scanner;

public class Main {
    private int a;
    private int b;
     public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        a = sc.nextInt();
        System.out.println("Enter the number b: ");
        b = sc.nextInt();
    }
    public int UCLN(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int BCLN(int a, int b){
         return (a*b) / UCLN(a,b);
    }
    public void output(){
         System.out.println("The number is " + UCLN(a,b));
         System.out.println("The number is " + BCLN(a,b));
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.input();
        m.output();

    }
}
