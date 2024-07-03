package se.alex.lexicon.model;

public class Drinks extends Product {
    private int volume;

    public Drinks(int id, String name, double price, int volume) {
        super(id, name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String examine() {
        return "Drink [ID=" + getId() + ", Name=" + getName() + ", Price=" + getPrice() + ", Volume=" + volume + "ml]";
    }

    @Override
    public String use() {
        return "You are drinking the " + getName() + " with " + volume + "ml.";
    }
}
