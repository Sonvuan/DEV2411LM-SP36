package Lab06.BaiThucHanh03;

import java.util.ArrayList;
import java.util.Collections;

public class BaiThucHanh03 {
    ArrayList <String> lstMonHoc = new ArrayList<>();

    public void test(){
        lstMonHoc.add("java");
        lstMonHoc.add("php");
        lstMonHoc.add("sql");
        lstMonHoc.add("c#");
        lstMonHoc.add("android");

        System.out.println("danh sách chưa sắp xếp");
        for(int i = 0; i<lstMonHoc.size(); i++){
            String get = lstMonHoc.get(i);
            System.out.println((i+1) +" "+ get);
        }

        Collections.sort(lstMonHoc);
        System.out.println("danh sách sau sắp xếp");
        for(int i = 0; i<lstMonHoc.size(); i++){
            String get = lstMonHoc.get(i);
            System.out.println((i+1) +" "+ get);
        }
    }
    public static void main(String[] args) {
        BaiThucHanh03 obj = new BaiThucHanh03();
        obj.test();
    }
}
