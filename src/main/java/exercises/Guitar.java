package exercises;

public class Guitar extends Instrument {

    // TODO: make the Guitar class inherit from the Instrument class

    private int numberOfStrings;

    public Guitar() {
        this.numberOfStrings = 6;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getInstrumentInfo() {

        // TODO: implement this method so it returns "This black guitar has 6 strings and costs 1000 dollars"
        //   use the getters from both the Guitar and the Instrument class to achieve this
        return String.format("This %s guitar has %d strings and costs %d dollars", this.getColor(), this.getNumberOfStrings(), this.getPrice());
    }
}
