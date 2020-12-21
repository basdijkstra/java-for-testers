package examples;

import java.util.*;

public class Car {

    private String make;
    private String model;
    private String color;

    public Car() {

        this.make = "default make";
        this.model = "default model";
        this.color = "default color";
    }

    public Car(String make, String model, String color) {

        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String printInfo() {

        return String.format("I'm a %s %s %s", this.color, this.make, this.model);
    }

    public boolean isItalian() {

        List<String> italianCarsList = Arrays.asList("Fiat", "Alfa Romeo", "Lancia", "Maserati", "Ferrari");
        return italianCarsList.contains(this.make);
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void anArrayOfCars() {

        Car[] carArray = new Car[3];

        carArray[0] = new Car("Fiat","Punto","red");
        carArray[1] = new Car("Ford","Focus","blue");
        carArray[2] = new Car("Maserati","Ghibli","black");

//        carArray[0] = new Car("Fiat","Punto",Color.RED);
//        carArray[1] = new Car("Ford","Focus",Color.BLUE);
//        carArray[2] = new Car("Maserati","Ghibli",Color.BLACK);

        for(int count = 0; count < carArray.length; count++) {
            System.out.println(
                carArray[count].printInfo()
            );
        }
    }

    public void aListOfCars() {

        List<Car> carList = new ArrayList<Car>();

        carList.add(new Car("Fiat","Punto","red"));
        carList.add(new Car("Ford","Focus","blue"));
        carList.add(new Car("Maserati","Ghibli","black"));

//        carList.add(new Car("Fiat","Punto", Color.RED));
//        carList.add(new Car("Ford","Focus",Color.BLUE));
//        carList.add(new Car("Maserati","Ghibli",Color.BLACK));

        for(Car car: carList) {
            System.out.println(
                car.printInfo()
            );
        }
    }
}
