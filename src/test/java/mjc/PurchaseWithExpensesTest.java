package test.java.mjc;

import main.java.mjc.Product;
import main.java.mjc.PurchaseWithExpenses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseWithExpensesTest {

    @Test
    void getCost() {
        Product product = new Product("Book", 1234);
        int amount = 5;
        PurchaseWithExpenses purchase = new PurchaseWithExpenses(product, amount, 525);
        double expected = 66.00;
        assertEquals(expected, purchase.getCost());
    }
}