public class PurchaseDiscountIfGreater extends AbstractPurchase {
    private double discount;
    private int requiredAmount;

    public PurchaseDiscountIfGreater(Product product, int amount, double discount, int requiredAmount) {
        super(product, amount);
        this.discount = 1 - discount / 100.;
        this.requiredAmount = requiredAmount;
        cost = getCost();
    }

    @Override
    public int getCost() {
        if (getAmount() > requiredAmount)
            return (int) ((getProduct().getPrice() * getAmount() * discount) / 100);
        else
            return (getProduct().getPrice() * getAmount()) / 100;
    }
}
