package Lab02.BaiTapTuLam9;

import java.util.Scanner;

public class TroChoi {
    private int choice1;
    private int choice2;
    public void player1(){
        System.out.println("tro choi keo bua giay");
        System.out.println("player1");
        System.out.println("1.Nhap Bua: ");
        System.out.println("2.Nhap Keo: ");
        System.out.println("3.Nhap Giay: ");
        Scanner sc = new Scanner(System.in);
        choice1=sc.nextInt();
    }
    public void player2(){
        System.out.println("player2");
        System.out.println("1.Nhap Bua: ");
        System.out.println("2.Nhap Keo: ");
        System.out.println("3.Nhap Giay: ");
        Scanner sc = new Scanner(System.in);
        choice2=sc.nextInt();
    }
    public void ktr(){
        switch(choice1){
            case 1:
                switch(choice2){
                    case 1:
                        System.out.print("Hoa");
                        break;
                    case 2:
                        System.out.print("thang");
                        break;
                    case 3:
                        System.out.print(" thua");
                        break;
                }
                break;
            case 2:
                switch(choice2){
                    case 1:
                        System.out.print("thua");
                        break;
                    case 2:
                        System.out.print("hoa");
                        break;
                    case 3:
                        System.out.print("thang");
                        break;
                }
                break;
            case 3:
                switch(choice2){
                    case 1:
                        System.out.print("thang");
                        break;
                    case 2:
                        System.out.print("thua");
                        break;
                    case 3:
                        System.out.print("hoa");
                        break;
                }
                break;
            default:
                System.out.print("Nhap sai");
                break;
        }
    }
    public static void main(String[] args) {
        TroChoi tro = new TroChoi();
        tro.player1();
        tro.player2();
        tro.ktr();
    }
}
