package products;

public class Accessory extends Product{
    private String color;

    public Accessory(String title, Double price) {
        super(title, price);
    }

    @Override
    protected String generateId() {
        numbers++;
        return Integer.toString(3000 + numbers);
    }

    @Override
    public String toString() {
        return String.format("%s , color: %s", super.toString(), color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
