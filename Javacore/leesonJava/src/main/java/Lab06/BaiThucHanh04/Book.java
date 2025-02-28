package Lab06.BaiThucHanh04;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String nxb;
    private int yearOfPublish;
    private String author;
    private int numOfPage;
    private float price;

    public void nhapDuLieu(){
        System.out.println("Nhap du lieu cho sach: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten Sach : ");
        bookName = sc.nextLine();
        System.out.println("Nhap Nxb : ");
        nxb = sc.nextLine();
        System.out.println("Nhap Nam Xuat Ban : ");
        yearOfPublish = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap Tac Gia : ");
        author = sc.nextLine();
        System.out.println("Nhap So Trang : ");
        numOfPage = sc.nextInt();
        System.out.println("Nhap Gia : ");
        price = sc.nextFloat();
    }
        @Override
        public String toString(){
            return "Book{"+"BookName="+bookName+",nxb="+nxb+",yearOfPublish="
                    +yearOfPublish+",author="+author+", numOfPage="+ numOfPage+
                    ",price="+price+'}';
        }

}
