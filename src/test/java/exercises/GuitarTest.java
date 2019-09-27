package exercises;

import org.junit.*;

public class GuitarTest {

    @Test
    public void testInstrumentInfo_ShouldReturnCorrectDescription() {

        // ARRANGE - Create a new Guitar object

        // ACT - Call the getInstrumentInfo() method and store the result in a String variable

        // ASSERT - Check that the info equals 'This black guitar has 6 strings and costs 1000 dollars'

    }

    @Test
    public void testGuitar_ShouldBeOfTheCorrectType() {

        // ARRANGE - Add a property 'type' to the Instrument class with default value 'acoustic'
        // ARRANGE - Add a getter method
        // ARRANGE - Change the getInstrumentInfo() method in the Guitar class so that it returns
        // 'This black acoustic guitar has 6 strings and costs 1000 dollars'

        // ACT - Call the getInstrumentInfo() method and store the result in a String variable

        // ASSERT - Check that the info equals 'This black acoustic guitar has 6 strings and costs 1000 dollars'

        // BONUS QUESTION: how would you make sure that the 'type' property could only take either the value
        // 'acoustic' or the value 'electric', but not something else?
    }
}
