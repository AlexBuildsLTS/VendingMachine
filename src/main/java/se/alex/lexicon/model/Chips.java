package se.alex.lexicon.model;

public class Chips extends Product {
    private String type;

    public Chips(int id, String name, int price, String type) {
        super(id, name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String examine() {
        return "Chips [ID: " + getId() + ", Name: " + getName() + ", Price: " + getPrice() + ", Type: " + type + "]";
    }

    @Override
    public String use() {
        return "You eat the " + getName() + ".";
    }
}
