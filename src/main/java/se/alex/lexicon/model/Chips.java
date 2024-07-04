package se.alex.lexicon.model;

public class Chips implements Product {
    private int id;
    private String name;
    private double price;
    private String type;

    public Chips(String name, double price, String type) {
        this.id = ProductSequencer.nextId();
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

    @Override
    public String use() {
        return "Enjoy your chips " + name + ".";
    }
}
