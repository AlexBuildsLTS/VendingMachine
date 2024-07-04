package se.alex.lexicon.model;

public class Drinks extends Product {
    private final String size;

    public Drinks(int id, String name, int price, String size) {
        super(id, name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String getDescription() {
        return "Drink: " + getName() + ", Size: " + size + ", Price: " + getPrice();
    }
}
