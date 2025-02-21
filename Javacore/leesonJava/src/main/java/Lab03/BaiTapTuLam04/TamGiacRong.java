package Lab03.BaiTapTuLam04;

public class TamGiacRong {
    public static void main(String[] args) {
        int h = 5; // Chiều cao của tam giác

        for (int i = 1; i <= h; i++) {  // Duyệt từng dòng
            // In khoảng trắng để căn giữa tam giác
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }

            // In dấu sao và khoảng trống
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == h) {
                    System.out.print("*"); // Viền ngoài và đáy tam giác
                } else {
                    System.out.print(" "); // Bên trong rỗng
                }
            }
            System.out.println();
        }
    }
}
