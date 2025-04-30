package Products;

public class Accessory extends Product{

    private String color;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        this.color = color;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color;
    }

    @Override
    protected String generateId() {
        return "3" + String.format("%d", Product.productCount);
    }
}
