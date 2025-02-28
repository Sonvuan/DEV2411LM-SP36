package Lab07.BaiTapTuLam01;

import java.util.Scanner;

public class City {
    private String cityId;
    private String cityName;
    private String country;
    private double area;

    public City(String cityId, String cityName, String country, double area) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.country = country;
        this.area = area;
    }

    public City() {
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the city ID: ");
        cityId = in.nextLine();
        System.out.print("Enter the city name: ");
        cityName = in.nextLine();
        System.out.print("Enter the country: ");
        country = in.nextLine();
        System.out.print("Enter the area of the city: ");
        area = in.nextDouble();
    }

    public void display(){
        System.out.println("City ID: " + cityId);
        System.out.println("City Name: " + cityName);
        System.out.println("Country: " + country);
        System.out.println("Area: " + area);

    }
}
