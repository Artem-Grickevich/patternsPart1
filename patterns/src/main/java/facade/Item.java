package facade;

public class Item {
    private String name;
    private int price;
    private int id;

    public Item(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
