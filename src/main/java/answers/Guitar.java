package answers;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar() {
        this.numberOfStrings = 6;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getInstrumentInfo() {
        return String.format("This %s guitar has %d strings and costs %d dollars", this.getColor(), this.getNumberOfStrings(), this.getPrice());
    }
}
