package test.java.mjc;

import main.java.mjc.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {

    @Test
    void searchCostExists() {
        Runner runner = new Runner();
        Product product = new Product("Apple", 85);
        AbstractPurchase[] purchases = {
                new PurchaseAllDiscounted(product, 16, 10),
                new PurchaseDiscountIfGreater(product, 15, 5.825, 10),
                new PurchaseWithExpenses(product, 5, 230),
        };
        runner.sort(purchases);
        final double SEARCH_KEY = 6.00;
        int expected = 2;
        assertEquals(expected, runner.search(purchases, SEARCH_KEY));
    }

    @Test
    void searchCostDoesNotExist() {
        Runner runner = new Runner();
        Product product = new Product("Apple", 85);
        AbstractPurchase[] purchases = {
                new PurchaseAllDiscounted(product, 16, 10),
                new PurchaseDiscountIfGreater(product, 15, 5.825, 10),
                new PurchaseWithExpenses(product, 5, 230),
        };
        runner.sort(purchases);
        final double SEARCH_KEY = 1.00;
        int expected = -1;
        assertEquals(expected, runner.search(purchases, SEARCH_KEY));
    }
}