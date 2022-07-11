import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseAllDiscountedTest {

    @Test
    void testToString() {
        Product product = new Product("Book", 1234);
        int amount = 7;
        PurchaseAllDiscounted purchase = new PurchaseAllDiscounted(product, amount, 15);
        String expected = "7;85.00";
        assertEquals(expected, purchase.toString());
    }

    @Test
    void compareToLess() {
        Product product1 = new Product("Book", 1234);
        Product product2 = new Product("Chair", 30450);
        int amount1 = 10;
        int amount2 = 2;
        PurchaseAllDiscounted purchase1 = new PurchaseAllDiscounted(product1, amount1, 234);
        PurchaseAllDiscounted purchase2 = new PurchaseAllDiscounted(product2, amount2, 500);
        int expected = 1;
        assertEquals(expected, purchase1.compareTo(purchase2));
    }

    @Test
    void compareToEqual() {
        Product product1 = new Product("Book", 1234);
        Product product2 = new Product("Chair", 10500);
        int amount1 = 10;
        int amount2 = 1;
        PurchaseAllDiscounted purchase1 = new PurchaseAllDiscounted(product1, amount1, 234);
        PurchaseAllDiscounted purchase2 = new PurchaseAllDiscounted(product2, amount2, 500);
        int expected = 0;
        assertEquals(expected, purchase1.compareTo(purchase2));
    }

    @Test
    void compareToGreater() {
        Product product1 = new Product("Book", 1234);
        Product product2 = new Product("Chair", 3045);
        int amount1 = 10;
        int amount2 = 1;
        PurchaseAllDiscounted purchase1 = new PurchaseAllDiscounted(product1, amount1, 234);
        PurchaseAllDiscounted purchase2 = new PurchaseAllDiscounted(product2, amount2, 500);
        int expected = -1;
        assertEquals(expected, purchase1.compareTo(purchase2));
    }

    @Test
    void getCost() {
        Product product = new Product("Book", 1234);
        int amount = 7;
        PurchaseAllDiscounted purchase = new PurchaseAllDiscounted(product, amount, 15);
        double expected = 85.00;
        assertEquals(expected, purchase.getCost());
    }
}