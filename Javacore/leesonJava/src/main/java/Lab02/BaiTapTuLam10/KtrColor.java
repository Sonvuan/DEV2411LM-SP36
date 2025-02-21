package Lab02.BaiTapTuLam10;

import java.util.Scanner;

public class KtrColor {
    private char color;
    public void input(){
        System.out.println("KiemTraMau!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ky tu mau: ");
        color = sc.next().charAt(0);

    }
    public void ktr(){
        if(color=='r' ||color=='R'){
            System.out.println("RED");
        }else if(color=='b' ||color=='B'){
            System.out.println("BLUE");
        }else if(color=='g' ||color=='G'){
            System.out.println("GREEN");
        }else{
            System.out.println("Black");
        }
    }
    public static void main(String[] args) {
        KtrColor ktrColor = new KtrColor();
        ktrColor.input();
        ktrColor.ktr();
    }
}
