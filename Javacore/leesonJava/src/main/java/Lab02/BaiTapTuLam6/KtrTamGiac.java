package Lab02.BaiTapTuLam6;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class KtrTamGiac {
    private int a;
    private int b;
    private int c;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Nhap c: ");
        c = sc.nextInt();
    }
    public void output(){
        double P = a + b + c;
        double p = (a+b+c)/2;
        double S = sqrt(p*(p-a)*(p-b)*(p-c));
        if(a>0 && b>0 && c>0){

            if((a+b)>c){
                System.out.println("Dien tich tam giac:" +S+
                        "\n"+"Chu vi tam giac:" +P);
            } else if ((b+c)>a) {
                System.out.println("Dien tich tam giac:" +S+
                        "\n"+"Chu vi tam giac:" +P);
            }else {
                System.out.println("Dien tich tam giac:" +S+
                        "\n"+"Chu vi tam giac:" +P);
            }
        }
    }
    public static void main(String[] args) {
        KtrTamGiac kt = new KtrTamGiac();
        kt.input();
        kt.output();
    }
}
