package Lab03.BaiTapLam08;

import java.util.Scanner;

public class GiaiThua {
    private int n;
    public void input(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            if(n>=16||n<=0){
                System.out.println("N lớn 0 hoăc nhỏ hơn 16");
            }
        }while(n<=0);
    }
    public void output(){
        int giaithua=1;
        for(int i=1;i<=n;i++){
            giaithua*=i;
        }
        System.out.println("Giai Thua: "+giaithua);
    }
    public static void main(String[] args) {
        GiaiThua g = new GiaiThua();
        g.input();
        g.output();
    }
}
