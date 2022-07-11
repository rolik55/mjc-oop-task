public class PurchaseAllDiscounted extends AbstractPurchase {
    private int discount;

    public PurchaseAllDiscounted(Product product, int amount, int discount) {
        super(product, amount);
        this.discount = discount;
        cost = getCost();
    }

    @Override
    public int getCost() {
        return ((getProduct().getPrice() - discount) * getAmount()) / 100;
    }
}
