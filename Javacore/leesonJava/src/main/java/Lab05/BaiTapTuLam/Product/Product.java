package Lab05.BaiTapTuLam.Product;

import java.util.Scanner;

public class Product {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    public Product() {
    }

    /**
     *
     * @param prodId masanpham
     * @param prodName tensanpham
     * @param manufacturer nhasanxuat
     * @param producerPrice giasanxuat
     */
    public Product(String prodId, String prodName, String manufacturer, float producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }



    /**
     *
     * @return ketqua
     */
    public float calculateSalePrice() {
      double sale_price =producerPrice + (float) (0.05 * producerPrice);
        return (float) sale_price;
    }



    public void display(){
        System.out.println("Product ID: " + prodId);
        System.out.println("Product Name: " + prodName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Producer Price: " + producerPrice);
        System.out.println("sale_price: "+calculateSalePrice());
    }


}
