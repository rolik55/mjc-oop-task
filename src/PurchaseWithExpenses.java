public class PurchaseWithExpenses extends AbstractPurchase {
    private int expenses;

    public PurchaseWithExpenses(Product product, int amount, int expenses) {
        super(product, amount);
        this.expenses = expenses;
        cost = getCost();
    }

    @Override
    public int getCost() {
        return (getProduct().getPrice() * getAmount() + expenses) / 100;
    }
}
