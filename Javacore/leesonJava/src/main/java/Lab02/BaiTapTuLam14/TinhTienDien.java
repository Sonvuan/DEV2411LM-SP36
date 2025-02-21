package Lab02.BaiTapTuLam14;

import java.util.Scanner;

public class TinhTienDien {
    private int chisocu;
    private int chisomoi;
    private int tienTBDT = 1000;
    private int tienDM = 230;
    private int tien_VDM50 = 480;
    private int tien_VDM51 = 700;
    private int tien_VDM100 = 900;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chisocu: ");
        chisocu = sc.nextInt();
        System.out.print("Chisomoi: ");
        chisomoi = sc.nextInt();
    }
    public void output(){


        if(chisocu < chisomoi){
            if(chisomoi < 50000){
                System.out.println("chỉ số cũ: " + chisocu
                +"\n"+"chỉ số mới: " + chisomoi
                        +"\n"+"tiền trả định mức: " + (tienDM*chisomoi)
                        +"\n"+"tổng tiền phải trả:" +(tienDM*chisomoi)*tienTBDT);
            }else if(chisomoi == 50000){
                System.out.println("chỉ số cũ: " + chisocu
                        +"\n"+"chỉ số mới: " + chisomoi
                        +"\n"+"tiền vượt định mức: " + (tien_VDM50 *chisomoi)
                        +"\n"+"tổng tiền phải trả:" +(tien_VDM50 *chisomoi)*tienTBDT);
            }else if(chisomoi < 100000){
                System.out.println("chỉ số cũ: " + chisocu
                        +"\n"+"chỉ số mới: " + chisomoi
                        +"\n"+"tiền vượt định mức: " + (tien_VDM51 *chisomoi)
                        +"\n"+"tổng tiền phải trả:" +(tien_VDM51 *chisomoi)*tienTBDT);
            } else if (chisomoi == 100000) {
                System.out.println("chỉ số cũ: " + chisocu
                        +"\n"+"chỉ số mới: " + chisomoi
                        +"\n"+"tiền vượt định mức: " + (tien_VDM100 *chisomoi)
                        +"\n"+"tổng tiền phải trả:" +(tien_VDM100 *chisomoi)*tienTBDT);
            }else{
                System.out.println("Vuot qua kw");
            }
        }else {
            System.out.println("Lỗi");
        }
    }
    public static void main(String[] args) {
        TinhTienDien tt = new TinhTienDien();
        tt.input();
        tt.output();
    }
}
