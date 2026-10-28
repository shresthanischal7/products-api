package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private final String downloadUrl;
    private final double fileSizeMb;

    public DigitalProduct(int id, String name, int qty, boolean inStock, double unitPrice,
                          String downloadUrl, double fileSizeMb) {
        super(id, name, qty, inStock, unitPrice);
        this.downloadUrl = downloadUrl;
        this.fileSizeMb = fileSizeMb;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMb() {
        return fileSizeMb;
    }
}
