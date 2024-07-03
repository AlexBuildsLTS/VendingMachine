package se.alex.lexicon.model;

public class Chips extends Product {
    private String type;

    public Chips(int id, String name, double price, String type) {
        super(id, name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return getName() + " are " + type + " chips.";
    }
}
