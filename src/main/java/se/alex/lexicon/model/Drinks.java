package se.alex.lexicon.model;

public class Drinks implements Product {
    private int id;
    private String name;
    private double price;
    private int volume;

    public Drinks(int id, String name, double price, int volume) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.volume = volume;
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
        return name + " is a drink with " + volume + "ml.";
    }
}
