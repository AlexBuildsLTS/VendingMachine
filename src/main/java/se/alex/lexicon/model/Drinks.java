package se.alex.lexicon.model;

public class Drinks extends Product {
    private int volume; // volume in ml

    public Drinks(int id, String name, double price, int volume) {
        super(id, name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String getDescription() {
        return getName() + " is a drink with " + volume + "ml.";
    }
}
