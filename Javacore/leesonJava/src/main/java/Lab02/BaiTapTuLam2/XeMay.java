package Lab02.BaiTapTuLam2;

import java.util.Scanner;

public class XeMay {
    String name;
    String nhaSanXuat;
    int soLuongBanhXe;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap name: ");
        name = sc.nextLine();
        System.out.print("Nhap nha San Xuat: ");
        nhaSanXuat = sc.nextLine();
        System.out.print("SoLuong banh: ");
        soLuongBanhXe = sc.nextInt();

    }
    public void output(){
        System.out.println("ten:"+name +
                "\n" +"nha san xuat:"+nhaSanXuat+
                "\n" + "so luong banh xe:"+soLuongBanhXe);
    }
    public static void main(String[] args) {
        XeMay xeMay = new XeMay();
        xeMay.input();
        xeMay.output();
    }
}
