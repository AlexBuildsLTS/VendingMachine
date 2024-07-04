package se.alex.lexicon.model;

public class Candy extends Product {
    private String flavor;

    public Candy(int id, String name, int price, String flavor) {
        super(id, name, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String examine() {
        return "Candy [ID: " + getId() + ", Name: " + getName() + ", Price: " + getPrice() + ", Flavor: " + flavor + "]";
    }

    @Override
    public String use() {
        return "You eat the " + getName() + ".";
    }
}
