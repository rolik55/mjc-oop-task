package main.java.mjc;

import java.util.Locale;

public class Main {
    private static final double SEARCH_KEY = 5.00;

    public static void main(String[] args) {
        Product product = new Product("Milk", 150);
        AbstractPurchase[] purchases = {
                new PurchaseAllDiscounted(product, 16, 10),
                new PurchaseAllDiscounted(product, 8, 5),
                new PurchaseDiscountIfGreater(product, 15, 5.825, 10),
                new PurchaseDiscountIfGreater(product, 10, 20, 10),
                new PurchaseWithExpenses(product, 5, 230),
                new PurchaseWithExpenses(product, 8, 180)
        };
        Runner runner = new Runner();

        runner.printPurchases(purchases);
        runner.sort(purchases);
        System.out.println();
        runner.printPurchases(purchases);
        runner.printMinimumCost(purchases);
        String formattedSearchKey = String.format(Locale.ROOT,"%.02f", SEARCH_KEY);
        int index = runner.search(purchases, SEARCH_KEY);
        if (index == -1)
            System.out.println("No purchase with cost " + formattedSearchKey + " found.");
        else System.out.println(purchases[index]);
    }
}