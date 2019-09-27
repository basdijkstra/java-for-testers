package answers;

import org.junit.*;

public class GuitarTest {

    @Test
    public void testInstrumentInfo_ShouldReturnCorrectDescription() {

        // ARRANGE - Create a new Guitar object
        Guitar guitar = new Guitar();

        // ACT - Call the getInstrumentInfo() method and store the result in a String variable
        String instrumentInfo = guitar.getInstrumentInfo();

        // ASSERT - Check that the info equals 'This black guitar has 6 strings and costs 1000 dollars'
        Assert.assertEquals(
            "This black guitar has 6 strings and costs 1000 dollars",
            instrumentInfo
        );
    }
}
