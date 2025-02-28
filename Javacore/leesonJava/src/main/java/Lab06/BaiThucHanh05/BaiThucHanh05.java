package Lab06.BaiThucHanh05;

public class BaiThucHanh05 {
    void yeuCau1(){
        String vietnam = "Việt Nam";
        System.out.println("concat() = " + vietnam.concat(" Cộng hòa XHCN"));

    }
    void yeucau2(){
        String baoViet = "Tổng Cty Bảo hiểm Bảo Việt (Bảo Hiểm Bảo Việt - Baoviet"
                + "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm"
                + "Bảo Việt đầu tư 100 vốn";
        System.out.println("length() = " + baoViet.length());
        baoViet = baoViet.replaceAll("Cty","Công Ty");
        System.out.println("replaceAll() = " + baoViet);
    }

    void yeucau3(){
        String baoViet = "Tổng Cty Bảo hiểm Bảo Việt (Bảo Hiểm Bảo Việt - Baoviet"
                + "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm"
                + "Bảo Việt đầu tư 100 vốn";
        System.out.println("toUpperCase() = " + baoViet.toUpperCase());
        System.out.println("toLowerCase() = " + baoViet.toLowerCase());
    }
    void yeucau4(){
        String baoViet = "Tổng Cty Bảo hiểm Bảo Việt (Bảo Hiểm Bảo Việt - Baoviet"
                + "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm"
                + "Bảo Việt đầu tư 100 vốn";
        System.out.println("lastIndexOf() ="+baoViet.lastIndexOf("Bảo Việt"));
    }
    void yeucau5(){
        String baoViet = "Tổng Cty Bảo hiểm Bảo Việt (Bảo Hiểm Bảo Việt - Baoviet"
                + "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm"
                + "Bảo Việt đầu tư 100 vốn";
        String [] arrBaoViet = baoViet.split(" ");
        for(int i=0; i<arrBaoViet.length; i++){
            String arrBaoViet1 = arrBaoViet[i];
            if((i%2) == 0){
                System.out.println("\t" +arrBaoViet1);
            }else{
                System.out.println(arrBaoViet1);
            }
        }
    }
    public static void main(String[] args) {
        BaiThucHanh05 obj = new BaiThucHanh05();
        obj.yeuCau1();
        obj.yeucau2();
        obj.yeucau3();
        obj.yeucau4();
        obj.yeucau5();
    }
}
