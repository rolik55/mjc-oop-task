public class Product {
    private String name;
    private Euro price;

    public Product(String name, int price) {
        this.name = name;
        this.price = new Euro(price);
    }

    public int getPrice() {
        return price.getValue();
    }

    @Override
    public String toString() {
        return name + ";" + price.getValue();
    }
}
