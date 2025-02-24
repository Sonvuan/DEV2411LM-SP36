package Lab05.BaiThucHanh3;



public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        SinhVien sv1 = new SinhVien(101,"anVuSon");

        sv.setRollNo(100);
        sv.setName("anvuson");
        sv.setAddress("hungyen");
        sv.setMark(10);

        System.out.println(sv.getRollNo()+sv.getName()+sv.getAddress()+sv.getMark());

        System.out.println("Mã Sinh Vien :"+sv1.getRollNo()+"\nTên Sinh VIên: "+sv1.getName());

    }
}
