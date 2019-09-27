package answers;

public class Instrument {

    private int price;
    private String color;

    public Instrument() {
        this.price = 1000;
        this.color = "black";
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getInstrumentInfo() {
        return String.format("This instrument is %s and costs %d dollars", this.color, this.price);
    }
}
