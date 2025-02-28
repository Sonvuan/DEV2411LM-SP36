package Lab07.BaiTapTuLam02;

import java.util.Scanner;

public class Flower {
    private String flowerID;
    private String flowerName;
    private String color;
    private int kindOfFlower;

    public Flower(String flowerID, String flowerName, String color, int kindOfFlower) {
        this.flowerID = flowerID;
        this.flowerName = flowerName;
        this.color = color;
        this.kindOfFlower = kindOfFlower;
    }

    public Flower() {
    }

    public String getFlowerID() {
        return flowerID;
    }

    public void setFlowerID(String flowerID) {
        this.flowerID = flowerID;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getKindOfFlower() {
        return kindOfFlower;
    }

    public void setKindOfFlower(int kindOfFlower) {
        this.kindOfFlower = kindOfFlower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the flower ID: ");
        flowerID = input.nextLine();
        System.out.print("Enter the flower name: ");
        flowerName = input.nextLine();
        System.out.print("Enter the color: ");
        color = input.nextLine();
        System.out.print("Enter the kind of flower: ");
        kindOfFlower = input.nextInt();

    }
    public void output(){
        System.out.println("Flower ID: " + flowerID);
        System.out.println("Flower Name: " + flowerName);
        System.out.println("Color: " + color);
        System.out.println("Kind of Flower: " + kindOfFlower);

    }
}
