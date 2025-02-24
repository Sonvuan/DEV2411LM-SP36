package Lab05.BaiTapTuLam.VietNam;

import Lab05.BaiTapTuLam.Product.Product;

import java.util.Scanner;

public class VietNamImportPrice extends Product {
    private float taxImported;

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public VietNamImportPrice() {

    }

    /**
     *
     * @param prodId masanpham
     * @param prodName tensanpham
     * @param manufacturer nhasanxuat
     * @param producerPrice giasanxuat
     * @param taxImported thuenhapkhau
     */
    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    /**
     *
     * @return gia nhập khẩu
     */
    @Override
    public float calculateSalePrice() {
        float imported_price = super.getProducerPrice();  // Giá nhập
        float sale_price = imported_price + (taxImported) * imported_price + 0.1f * (imported_price + taxImported * imported_price);
        return sale_price;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Thuế: " + (int) (taxImported *100)+"%");
        System.out.println("Giá Bán Tại Việt Nam: " + calculateSalePrice());
    }
}
