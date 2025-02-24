package Lab05.BaiTapTuLam2;

import Lab05.BaiTapTuLam1.Product;

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

    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }
    @Override
    public float caculateSalePrice(){
        

    }
}
