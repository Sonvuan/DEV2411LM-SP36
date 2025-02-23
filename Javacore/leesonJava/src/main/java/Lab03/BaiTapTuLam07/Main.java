package Lab03.BaiTapTuLam07;

import java.util.Scanner;

public class Main {
    private int n;

    public void input() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter N: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Giá trị của n phải lớn hơn 0. Vui lòng nhập lại!");

            }
        }while(n <= 0);


    }
    public void SoLe(){
        System.out.print("Các Số lẻ :");
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.print(i);
            }else{
                System.out.print(",");
            }
        }
        System.out.println();
    }
    // Hàm tính tổng các số lẻ từ 1 đến n
    public double TongBP() {
        double sum1 = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                sum1 += i;
            }
        }
        return Math.sqrt(sum1);
    }

    // Hàm tính tổng và trung bình cộng từ 1 đến n
    public void C() {
        double sum = 0;
        double TBC = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        TBC = sum / n;  // Sửa công thức tính trung bình cộng
        boolean found = false;
        for(int i =1; i <= n; i++){
            if(i%2==0 && i>TBC){
                System.out.println("So Chan Lon Hon Trung Binh Cong: " +i);
                found = true;
            }
        }
        if(!found){
            System.out.println("Không có số chẵn nào lớn hơn trung bình cộng");
        }else{
            System.out.println();
        }
        System.out.println("Tổng các số từ 1 đến : "  + sum);
        System.out.println("Trung bình cộng: " + TBC);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.input();
        m.SoLe();
        System.out.println("Tổng Binh Phuong các số lẻ từ 1 đến n: "+ m.TongBP());
        m.C();
    }
}
