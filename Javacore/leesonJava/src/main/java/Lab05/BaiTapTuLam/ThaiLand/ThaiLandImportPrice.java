package Lab05.BaiTapTuLam.ThaiLand;

import Lab05.BaiTapTuLam.Product.Product;

import java.util.Scanner;

public class ThaiLandImportPrice extends Product {
    private float taxImported;
    private float importPriceSupport;

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getImportPriceSupport() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
    }

    public ThaiLandImportPrice() {
    }

    /**
     *
     * @param prodId masanpham
     * @param prodName tensanpham
     * @param manufacturer nhasanxuat
     * @param producerPrice giasanxuat
     * @param taxImported thuenhapkhau
     * @param importPriceSupport giá hỗ trợ nhập khẩu
     */
    public ThaiLandImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported, float importPriceSupport) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    @Override
    public float calculateSalePrice() {
        float imported_price = super.getProducerPrice();
        float tax_amount = taxImported * imported_price;
        float support_amount = importPriceSupport * imported_price;

        float sale_price = imported_price + tax_amount - support_amount +
                0.1f * (imported_price + tax_amount - support_amount);

        return sale_price;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Thuế Nhập Khẩu: " + (int) (taxImported * 100) + "%");
        System.out.println("Giá Hỗ Trợ Nhập Khẩu: " + (int) (importPriceSupport * 100) + "%");
        System.out.println("Giá Bán Tại Thái Lan: " + calculateSalePrice());
    }


}
