import inventory.Inventory;
import products.Accessory;
import products.Book;
import products.NoteBook;
import products.Product;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> books = new Inventory<>();
        Inventory<Accessory> accessory = new Inventory<>();
        Inventory<NoteBook> noteBook = new Inventory<>();

        Book book = new Book("calcules 1", 1000d, "paria", "ros", "None");
        Book book1 = new Book("lsjlsjflasjfl", 1d, "matin", "ros", "math");

        Accessory accessory1 = new Accessory("dljf", 1200d);
        Accessory accessory2 = new Accessory("ahhhh", 12d);

        NoteBook noteBook1 = new NoteBook("ohhhh", 1222d, 12, true);
        NoteBook noteBook2 = new NoteBook("hayaaaaaaa", 221d, 21, false);

        books.addItem(book);
        books.addItem(book1);
        accessory.addItem(accessory1);
        accessory.addItem(accessory2);
        noteBook.addItem(noteBook1);
        noteBook.addItem(noteBook2);

        for (Book booka : books.getItems()) {
            System.out.println(booka.toString());
        }

        for (Accessory accessorya : accessory.getItems()) {
            System.out.println(accessorya.toString());
        }

        for  (NoteBook noteBooka : noteBook.getItems()) {
            System.out.println(noteBooka.toString());
        }

        noteBook.removeById("3002");
        books.removeById("1001");

        System.out.println(calculateTotalPrice(books));
        System.out.println(calculateTotalPrice(noteBook));
        System.out.println(calculateTotalPrice(accessory));

        noteBook.applyDiscount("hayaaaaaaa", 5);
        books.applyDiscount("lsjlsjflasjfl", 10);

        Book test = books.findItemById("6464");
        Book test1 = books.findItemById("1002");

        for (Book booka : books.getItems()) {
            System.out.println(booka.toString());
        }

        for (Accessory accessorya : accessory.getItems()) {
            System.out.println(accessorya.toString());
        }

        for  (NoteBook noteBooka : noteBook.getItems()) {
            System.out.println(noteBooka.toString());
        }
    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double sum = 0;
        for (Product product : inventory.getItems()) {
            sum += product.getPrice();
        }
        return sum;
    }
}