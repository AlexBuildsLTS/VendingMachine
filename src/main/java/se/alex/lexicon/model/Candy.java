package se.alex.lexicon.model;

public class Candy implements Product {
    private int id;
    private String name;
    private double price;
    private String flavor;

    public Candy(String name, double price, String flavor) {
        this.id = ProductSequencer.nextId();
        this.name = name;
        this.price = price;
        this.flavor = flavor;
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
        return name + " Enjoy your " + flavor + " flavor.";
    }

    @Override
    public String use() {
        return "Enjoy your  " + name + ".";
    }
}
