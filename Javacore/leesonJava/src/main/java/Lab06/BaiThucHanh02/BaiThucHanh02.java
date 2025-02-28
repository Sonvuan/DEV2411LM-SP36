package Lab06.BaiThucHanh02;

import java.util.Scanner;

public class BaiThucHanh02 {
    String arrNhanVien [] [] = new String[3][2];

    /**
     * Hàm nhập liệu nhân viên với mảng 2 chiều
     */
    public void NhapDuLieu(){
        for(int i=0;i<arrNhanVien.length;i++){
            System.out.println("Nhập thông tin cho nhân viên thứ: " +(i+1));
            Scanner sc = new Scanner(System.in);
            arrNhanVien[i][0] = sc.nextLine();
            arrNhanVien[i][1] = sc.nextLine();
        }
        System.out.println("Cảm ơn đã nhập liệu");
    }


    /**
     * Sẵp xếp từ bé đến lớn
     */
    public void sapXep(){
        for(int i=0;i<arrNhanVien.length;i++){
            for(int j=i+1;j<arrNhanVien.length;j++){
                if(Float.parseFloat(arrNhanVien[j][1])<Float.parseFloat(arrNhanVien[i][1])){
                    String temp[][] = new String[1][2];

                    // đổi chỗ
                    temp[0][0] = arrNhanVien[j][0];
                    temp[0][1] = arrNhanVien[j][1];

                    arrNhanVien[j][0] = arrNhanVien[i][0];
                    arrNhanVien[j][1] = arrNhanVien[i][1];

                    arrNhanVien[i][0] = temp[0][0];
                    arrNhanVien[i][1] = temp[0][1];
                }
            }
        }
    }

    public void hienThi(){
        for(int i=0;i<arrNhanVien.length;i++){
            System.out.println(arrNhanVien[i][0] + "-" + arrNhanVien[i][1]);
        }
    }

    public static void main(String[] args) {
        BaiThucHanh02 main = new BaiThucHanh02();
        main.NhapDuLieu();
        main.sapXep();
        main.hienThi();


    }
}
