package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public void applyDiscount(String productName, int discount) {
        T item = findItemByName(productName);
        int x = (100 - discount) / 100;
        item.setPrice(item.getPrice() * x);
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeById(String id) {
        items.remove(findItemById(id));
    }

    public T findItemByName(String name) {
        for (T item : items) {
            if (item.getTitle().equals(name))
                return item;
        }
        return null;
    }

    public T findItemById(String id) {
        for (T item : items) {
            if (item.getId().equals(id))
                return item;
        }
        return null;
    }

    public void displayAll() {
        for (T item : items)
            System.out.println(item.toString());
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }
}
