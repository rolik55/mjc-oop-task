import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseDiscountIfGreaterTest {

    @Test
    void getCostWhenAmountIsGreater() {
        Product product = new Product("Book", 1234);
        int amount = 7;
        PurchaseDiscountIfGreater purchase = new PurchaseDiscountIfGreater(product, amount, 15, 5);
        double expected = 73.00;
        assertEquals(expected, purchase.getCost());
    }

    @Test
    void getCostWhenAmountIsLesser() {
        Product product = new Product("Book", 1234);
        int amount = 7;
        PurchaseDiscountIfGreater purchase = new PurchaseDiscountIfGreater(product, amount, 15, 10);
        double expected = 86.00;
        assertEquals(expected, purchase.getCost());
    }
}