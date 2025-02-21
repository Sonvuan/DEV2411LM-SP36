package Lab02.BaiTapTuLam7;

import java.util.Scanner;

public class KtrThang {
    private int thang;
    private int nam;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thang: ");
        thang = sc.nextInt();
        System.out.print("Enter nam: ");
        nam = sc.nextInt();


    }
    public void output() {
        if(thang ==1 || thang ==3 || thang ==5 || thang ==7 || thang ==8 || thang == 10  || thang == 12) {
            System.out.println("Thang co 30 ngay");
        } else if (thang ==2) {
            if(nam%100==0 && nam%400!=0) {
                System.out.println("Thang co 28 ngay");
            }
            if(nam%400==0 && nam%100==0) {
                System.out.println("Thang co 29 ngay");
            }
        }else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Thang co 30 ngay");
        }else {
            System.out.println("khong hop le ");
        }
    }
    public static void main(String[] args) {
        KtrThang kt = new KtrThang();
        kt.input();
        kt.output();
    }
}
