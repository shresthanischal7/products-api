package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Locale;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    private int nextId = 1;

    public List<Product> getAllProducts() {
        return List.copyOf(products);
    }

    public Optional<Product> getProductById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }

    public List<Product> findByName(String name) {
        if (name == null || name.isBlank()) {
            return List.of();
        }
        String query = name.toLowerCase(Locale.ROOT);
        return products.stream()
                .filter(p -> p.getName() != null
                        && p.getName().toLowerCase(Locale.ROOT).contains(query))
                .toList();
    }

    public Product addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product must not be null");
        }
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public List<Product> addGetInheritedProduct() {
        DigitalProduct dp = new DigitalProduct(nextId++,
                "Digital Product",
                2,
                true,
                34.99,
                "http://xsdfa.com/file/3434",
                23.33);
        PhysicalProduct physicalProduct = new PhysicalProduct(nextId++,
                "Physical Product",
                3,
                true,
                11.99,
                3.09,
                "20x10");
        products.add(dp);
        products.add(physicalProduct);
        return List.copyOf(products);
    }
    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}
