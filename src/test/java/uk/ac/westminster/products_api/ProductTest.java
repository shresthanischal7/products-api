package uk.ac.westminster.products_api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testProduct(){
        Product product = new Product(11, "Laptop", 20, true,30);
        assertEquals(11, product.getId());
        assertEquals("Laptop", product.getName());
    }
}
