package Lab04.BaiTapTuLam01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Lớp HoaDonBanhMy
class HoaDonBanhMy {
    private String maHD;
    private Date ngayLapHoaDon;
    private String tenKhachHang;
    private String diaChi;
    private int soLuong;
    private double giaBanh1Cai;
    private double tongTienHang;
    private double tienKhuyenMai;
    private double tongTienThanhToan;

    // Hàm nhập thông tin hóa đơn
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hóa đơn: ");
        maHD = sc.nextLine();

        System.out.print("Nhập ngày lập hóa đơn (dd/MM/yyyy): ");
        String ngayStr = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngayLapHoaDon = sdf.parse(ngayStr);
        } catch (ParseException e) {
            System.out.println("Lỗi: Định dạng ngày không hợp lệ!");
            return;
        }

        System.out.print("Nhập tên khách hàng: ");
        tenKhachHang = sc.nextLine();

        System.out.print("Nhập địa chỉ khách: ");
        diaChi = sc.nextLine();

        System.out.print("Nhập số lượng bánh cần giao: ");
        soLuong = sc.nextInt();

        System.out.print("Nhập giá bán 1 chiếc bánh: ");
        giaBanh1Cai = sc.nextDouble();

        // Tính tổng tiền hàng
        tongTienHang = soLuong * giaBanh1Cai;

        // Tính tiền khuyến mãi
        tinhTienKmai();
    }

    // Hàm tính khuyến mãi
    public void tinhTienKmai() {
        if (soLuong >= 100) {
            tienKhuyenMai = tongTienHang * 0.2; // Giảm 20% tổng tiền hàng
            tongTienThanhToan = tongTienHang - tienKhuyenMai;
        } else if (soLuong >= 10) {
            double giaMoi = giaBanh1Cai * 0.9; // Giảm 10% giá mỗi chiếc bánh
            tongTienHang = soLuong * giaMoi;
            tienKhuyenMai = (giaBanh1Cai * soLuong) - tongTienHang; // Chênh lệch giá gốc và giá giảm
            tongTienThanhToan = tongTienHang;
        } else {
            tienKhuyenMai = 0;
            tongTienThanhToan = tongTienHang;
        }
    }

    // Hàm xuất hóa đơn
    public void inHoaDon() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\n===== HÓA ĐƠN BÁNH MÌ =====");
        System.out.println("Mã hóa đơn: " + maHD);
        System.out.println("Ngày lập hóa đơn: " + sdf.format(ngayLapHoaDon));
        System.out.println("Tên khách hàng: " + tenKhachHang);
        System.out.println("Địa chỉ khách: " + diaChi);
        System.out.println("Số lượng bánh: " + soLuong);
        System.out.println("Giá 1 chiếc bánh: " + giaBanh1Cai + " VND");
        System.out.println("Tổng tiền hàng: " + tongTienHang + " VND");
        System.out.println("Tiền khuyến mãi: " + tienKhuyenMai + " VND");
        System.out.println("Tổng tiền thanh toán: " + tongTienThanhToan + " VND");
    }
    public static void main(String[] args) {
        HoaDonBanhMy hoa = new HoaDonBanhMy();
        hoa.nhap();
        hoa.inHoaDon();
    }
}

