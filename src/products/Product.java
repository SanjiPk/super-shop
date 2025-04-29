package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;
    protected static int numbers = 0;

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    protected abstract String generateId();

    @Override
    public String toString() {
        return String.format("%s price is %f with id :%s", title, price, id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
