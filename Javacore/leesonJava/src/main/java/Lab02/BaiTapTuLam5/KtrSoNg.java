package Lab02.BaiTapTuLam5;

import java.util.Scanner;

public class KtrSoNg {
    private int n;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
    }
    public void output(){
        if(n%2 ==0){
            System.out.println("N la so chan");
        }else {
            System.out.println("N la so le");
        }
    }
    public static void main(String[] args) {
        KtrSoNg k = new KtrSoNg();
        k.input();
        k.output();
    }
}
