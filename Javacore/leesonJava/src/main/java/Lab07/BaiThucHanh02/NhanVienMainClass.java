package Lab07.BaiThucHanh02;

public class NhanVienMainClass {
    public static void main(String[] args) {
        NhanVien [] arrNhanVien = new NhanVien[3];
        arrNhanVien[0] = new NhanVien();
        arrNhanVien[0].name ="NgocTrinh";
        arrNhanVien[0].cntt++;

        arrNhanVien[1] = new NhanVien();
        arrNhanVien[1].name ="Ngoc";
        arrNhanVien[1].cntt++;

        arrNhanVien[2] = new NhanVien();
        arrNhanVien[2].name ="Trinh";
        arrNhanVien[2].cntt++;

        for (int i = 0; i < arrNhanVien.length; i++) {
            NhanVien nhanVien = arrNhanVien[i];
            System.out.println(nhanVien.name + "cntt = " + nhanVien.cntt);
        }
    }
}
