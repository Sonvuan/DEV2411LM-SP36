package Lab02.BaiTapTuLam12;

import java.util.Scanner;

public class ktrDiem {
    private float diemT;
    private float diemL;
    private float diemH;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Diem T: ");
        diemT = sc.nextFloat();
        System.out.println("Enter Diem L: ");
        diemL = sc.nextFloat();
        System.out.println("Enter Diem H: ");
        diemH = sc.nextFloat();
    }
    public void output(){
        float diemTong = diemT+diemL+diemH;
        if(diemTong>=15 && ((diemT>4) && diemH>4 && diemL>4)){
                System.out.println("Dau");
                if(diemT>=5 && diemH>=5 && diemL>=5){
                    System.out.println("hoc deu cac mon");
                }else{
                    System.out.println("Chua hoc deu cac mon");
                }
        }else {
            System.out.println("thi hong");
        }
    }
    public static void main(String[] args) {
        ktrDiem kt = new ktrDiem();
        kt.input();
        kt.output();

    }
}
