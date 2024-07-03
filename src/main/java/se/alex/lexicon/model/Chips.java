package se.alex.lexicon.model;

public class Chips implements Product {
    private int id;
    private String name;
    private double price;
    private String type;

    public Chips(int id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return name + " are " + type + " chips.";
    }
}
