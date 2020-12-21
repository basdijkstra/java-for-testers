package examples;

public class Fruit {

    public void newSwitchStatement() {

        String value = getFruit();

        switch(value) {
            case "apple" -> System.out.println("I'm an apple");
            case "pear" -> System.out.println("I'm a pear");
            case "banana" -> System.out.println("I'm a banana");
            default -> {
                System.out.println("Error: no fruit found");
                throw new IllegalArgumentException("Invalid fruit value");
            }
        }
    }

    private String getFruit() {

        return "banana";
    }
}
