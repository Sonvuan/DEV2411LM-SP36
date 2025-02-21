package Lab02.BaiTapTuLam8;

import java.util.Scanner;

public class TimMax {
    private int a;
    private int b;
    private int c;
    private int d;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        System.out.println("Enter d: ");
        d = sc.nextInt();
    }
    public void ktr(){
        int x = Math.max(a, b);
        int y = Math.max(c, d);
        if(a>b && c>d){
            if(x>y){
                System.out.println("So nguyen lon nhat:"+x);
            }else {
                System.out.println("So nguyen lon nhat:"+y);
            }
        }else if(a<b && c<d){
            if(x<y){
                System.out.println("So nguyen lon nhat:"+y);
            }else {
                System.out.println("So nguyen lon nhat:"+x);
            }
        }else if(a==b && c==d){
            System.out.println("khong co so lon nhat:");
        }else{
            System.out.println("loi nhap:");
        }
    }
    public static void main(String[] args) {
        TimMax tm = new TimMax();
        tm.input();
        tm.ktr();
    }
}
