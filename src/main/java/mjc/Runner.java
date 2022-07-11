package main.java.mjc;

import java.util.Arrays;
import java.util.Locale;

public class Runner {

    public void printPurchases(AbstractPurchase[] purchases) {
        for (int i = 0; i < purchases.length; i++)
            System.out.println(purchases[i]);
    }

    public void sort(AbstractPurchase[] purchases) {
        Arrays.sort(purchases);
    }

    public void printMinimumCost(AbstractPurchase[] purchases) {
        String formattedCost = String.format(Locale.ROOT, "%.02f", purchases[purchases.length - 1].getCost() * 1.);
        System.out.println("Minimum cost = " + formattedCost);
    }

    public int search(AbstractPurchase[] purchases, double searchKey) {
        //Array of costs that will be searched
        double[] costs = new double[purchases.length];
        for (int i = 0; i < purchases.length; i++)
            costs[i] = purchases[i].cost;
        //Array needs to be ordered in order to use binary search
        Arrays.sort(costs);
        int index = Arrays.binarySearch(costs, searchKey);
        //Since the purchase array is in descending order we need to reverse the index
        if (index != -1)
            index = (purchases.length - 1) - index;
        return index;
    }
}
