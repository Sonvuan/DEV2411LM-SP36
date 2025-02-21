package Lab02.BaiTapTuLam11;

import java.util.Scanner;

public class KtrPhepTinh {
    private float x;
    private float y;
    private char z;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = sc.nextFloat();
        System.out.print("Enter y: ");
        y = sc.nextFloat();
        System.out.print("Enter z: ");
        z = sc.next().charAt(0);
    }
    public void output(){
        if(z == '+'){
            System.out.print(x+y);
        }else if(z == '-'){
            System.out.print(x-y);
        }else if(z == '*'){
            System.out.print(x*y);
        }else if(z == '/'){
            if(y==0){
                System.out.print("khong chia duoc");
            }else{
                System.out.print(x/y);
            }
        }else{
            System.out.print("Nhap sai toan tu");
        }
    }
    public static void main(String[] args) {
        KtrPhepTinh kt = new KtrPhepTinh();
        kt.input();
        kt.output();

    }
}
