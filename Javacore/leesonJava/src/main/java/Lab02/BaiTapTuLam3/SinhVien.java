package Lab02.BaiTapTuLam3;

import java.util.Scanner;

public class SinhVien {
    private String name;
    private String maSv;
    private double diemLT;
    private double diemTH;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        name = sc.nextLine();
        System.out.print("Enter the ma sv : ");
        maSv = sc.nextLine();
        System.out.print("Enter the diem lt : ");
        diemLT = sc.nextDouble();
        System.out.print("Enter the diem th : ");
        diemTH = sc.nextDouble();
    }
    public void kiemtra(){
        double diemTB = (diemLT + diemTH)/2;
        if(diemLT < 4){
            System.out.println("Thi lai ly thuyet");
        }else if(diemTH < 4){
            System.out.println("Thi lai thuc hanh");
        } else if (diemTB < 4) {
            System.out.println("hoc lai");
        } else if (diemTB < 7) {
            System.out.println("Dat mon Java");
        } else if (diemTB > 7) {
            System.out.println("Xuat sac mon Java");
        }
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.input();
        sv.kiemtra();
    }
}
