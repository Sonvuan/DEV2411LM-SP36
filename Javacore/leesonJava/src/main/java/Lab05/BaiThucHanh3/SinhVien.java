package Lab05.BaiThucHanh3;

public class SinhVien {
    private int rollNo;
    private String name;
    private String address;
    private float mark;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public SinhVien() {
    }

    /**
     *
     * @param rollNo masinhvien
     * @param name tensinhvien
     */
    public SinhVien(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    /**
     *
     * @param rollNo masinhvien
     * @param name   tensinhvien
     * @param address diachicuasinhvien
     */
    public SinhVien(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    /**
     *
     * @param rollNo masinhvien
     * @param name   tensinhvien
     * @param address diachicuasinhvien
     * @param mark diemcuasinhvien
     */
    public SinhVien(int rollNo, String name, String address, float mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.mark = mark;
    }
}
