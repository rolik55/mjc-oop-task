package test.java.mjc;

import main.java.mjc.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        String expected = "Book;1234";
        Product product = new Product("Book", 1234);
        assertEquals(expected, product.toString());
    }
}