package uk.ac.westminster.products_api;

public class Product {

    private static int instanceCount = 0;

    private int id;
    private String name;
    private int qty;
    private boolean inStock;
    private double unitPrice;

    public Product() {
        instanceCount++;
    }

    public Product(int id, String name, int qty, boolean inStock, double unitPrice) {
        this();
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.inStock = inStock;
        this.unitPrice = unitPrice;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}