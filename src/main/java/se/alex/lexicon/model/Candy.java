package se.alex.lexicon.model;

public class Candy extends Product {
    private final String flavor;

    public Candy(int id, String name, int price, String flavor) {
        super(id, name, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String getDescription() {
        return "Candy: " + getName() + ", Flavor: " + flavor + ", Price: " + getPrice();
    }
}
