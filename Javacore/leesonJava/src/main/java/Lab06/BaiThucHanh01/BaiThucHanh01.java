package Lab06.BaiThucHanh01;

import java.util.Scanner;

public class BaiThucHanh01 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String [] arrSinhVien = new String[3];

        // nhập dữ liệu
        for(int i = 0; i < arrSinhVien.length; i++){
            Scanner sc = new Scanner(System.in);
            arrSinhVien[i] = sc.nextLine();
        }
        // hiển thị dữ liệu
        for(String str : arrSinhVien){
            System.out.println(str);
        }
    }
}
