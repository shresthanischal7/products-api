package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private final double weight;
    private final String dimensions;

    public PhysicalProduct(int id, String name, int qty, boolean inStock, double unitPrice,
                           double weight, String dimensions) {
        super(id, name, qty, inStock, unitPrice);
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDimensions() {
        return dimensions;
    }
}
