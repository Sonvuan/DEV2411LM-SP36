package Lab02.BaiTapTuLam4;

import java.util.Scanner;

public class PTB2 {
    private double a;
    private double b;
    private double c;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an a: ");
        a = sc.nextDouble();
        System.out.println("Enter an b: ");
        b = sc.nextDouble();
        System.out.println("Enter an c: ");
        c = sc.nextDouble();
    }
    public void check(){
        double delta = b*b - 4*a*c;
        double N3 =(-b/2*a);
        double N1 = (-b + Math.sqrt(delta))/(2*a);
        double N2 = (-b - Math.sqrt(delta))/(2*a);
        double x= ((-1.0) *c)/b;
        if(a==0){
            if(b==0){
                System.out.println("PTVON");
            } else if (c==0) {
                System.out.println("PT co nghiem: "+x);
            }else {
                System.out.println("PT co nghiem: "+x);
            }
        }else{
            if(delta==0){
                System.out.println("PT co nghiem kep:" +N3);
            }else if(delta < 0){
                System.out.println("PTVON:");
            }else {
                System.out.println("PT co nghiem 1:" +N1+
                "\n"+"PT co nghiem 2: "+N2);
            }
        }
    }
    public static void main(String[] args) {
        PTB2 obj = new PTB2();
        obj.input();
        obj.check();
    }
}
