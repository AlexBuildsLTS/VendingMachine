package se.alex.lexicon.model;

public class Chips extends Product {
    private final String type;

    public Chips(int id, String name, int price, String type) {
        super(id, name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return "Chips: " + getName() + ", Type: " + type + ", Price: " + getPrice();
    }
}
