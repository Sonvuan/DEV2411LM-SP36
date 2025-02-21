package Lab02;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private double salary;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap dia chi:");
        address = sc.nextLine();
        System.out.println("Nhap salary:");
        salary = sc.nextDouble();
    }
    public void view(){
        System.out.println("ten:"+name +
                "\n" +"dia chi:"+address+
                "\n" + "salary:"+salary);
    }
    public static void main (String[] args){
        Person p = new Person();
        p.input();
        p.view();
    }
}
