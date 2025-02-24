package Lab05.BaiThucHanh2;

public class Shape {
    // tính nạp chồng thể hiện qua các phương thức có cùng tên nhưng khác nhau về tham số truyền vào
    /**
     *
     * @author anvuson
     */
        public static final int SHAPE_RECTANGLE = 1;
        public static final int SHAPE_CIRCLE = 2;
        public static final int SHAPE_TRIANGLE = 3;

        public int shareCode=0;

    /**
     *
     * @param width chieu rong
     * @param height chieu dai
     * @return void
     * @See dien tich hinh chu nhat - vuong
     */
    public void tinhDienTich(float width,float height){

            if(width<height || height<width){
                float area=width*height;
                System.out.println("Diện tích hình chữ nhật : " + area);
            }else {
                float area=width*height;
                System.out.println("Diện tích hình vuông : " + area);
            }
    }

    /**
     *
     * @param radius Ban kinh cua hinh tron
     * @return void
     * @See Diện tích hình tròn
     */
    public void tinhDienTich(float radius){
            float area=radius*radius;
            System.out.println("Diện tích hình tròn : " + area);
    }

    /**
     *
     * @param height chieu cao tam giac
     * @param bottom chieu dai canh day
     * @See dien tich hinh tam giac
     */
    public void tinhDienTich(float height, double bottom){
            double area=height*bottom;
            System.out.println("Diện tích hình tam giác: " + area);
    }

    /**
     *
     * @param width chieu dai
     * @param height chieu rong
     * @See chu vi cua hinh chu nhat_vuong
     */
    public void tinhChuVi(float width,float height){
            float perimeter = 2 * (width + height);
            System.out.println("Chu vi hình chữ nhật: " + perimeter);
    }

    /**
     *
     * @param radius ban kinh
     * @See chu vi của hình tròn
     */
    public void tinhChuVi(float radius){
            double perimeter = 2 * Math.PI * radius;
            System.out.println("Chu vi hình tròn: " + perimeter);
    }

    /**
     *
     * @param edge canh thu 1
     * @param edge2 canh thu 2
     * @param edge3 canh thu 3
     * @See chu vi của tam giac
     */
    public void tinhChuVi(float edge, float edge2,float edge3){
        float perimeter = edge + edge2 + edge3;
        System.out.println("Chu vi hình tam giác: " + perimeter);
    }
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.tinhDienTich(5, 5);
        shape.tinhDienTich(6.9f);
    }

}
