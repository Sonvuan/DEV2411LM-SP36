package Lab02.BaiTapTuLam13;

import java.util.Scanner;

public class TinhLuong {
    private double soGioLam;
    private double luong1h;
    public void intput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap soGioLam:");
        soGioLam = sc.nextDouble();
        System.out.println("nhap luong1h:");
        luong1h = sc.nextDouble();
    }
    public void output() {
        double luongTong = soGioLam * luong1h;
        if(soGioLam <=40) {
            System.out.println("So tien nhan duoc:"+luongTong);

        }else {
            System.out.println("So tien nhan duoc:"+(luongTong)+(soGioLam*1.5*luong1h));
        }
    }
    public static void main(String[] args) {
        TinhLuong t = new TinhLuong();
        t.intput();
        t.output();
    }
}
