package exercises;

import examples.Car;
import org.junit.*;

public class ReadyTest {

    @Test
    public void amIReady() {

        Car myCar = new Car("Alfa Romeo","Giulia","blue");

        boolean isItalian = myCar.isItalian();

        Assert.assertTrue(isItalian);
    }
}
