package exercises;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.mockito.Mockito.*;

public class SteeringWheelTest {

    @Test
    public void testSteeringLeft() throws Exception {

        // ARRANGE - Create a new instance of the SteeringWheel class

        // ARRANGE - Create a mock for the IWheels object

        // ARRANGE - Set the behavior of the mock so that a call to turnLeft returns "turned left"

        // ACT - Steer to the left and store the result in a String variable

        // ASSERT - Assert that the feedback equals "turned left"

        // ASSERT - Assert that the turnLeft() method of the mock was called exactly once

        // ASSERT - Assert that the turnRight() method of the mock was not called

    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testSteeringThrowsException() throws Exception {

        // ARRANGE - Tell the exceptionRule to expect an exception of type UnsupportedOperationException.class

        // ARRANGE - Create a new instance of the SteeringWheel class

        // ARRANGE - Create a mock for the IWheels object

        // ARRANGE - Set the behavior of the mock so that a call to turnLeft returns "turned left"

        // ACT - Steer to the left to trigger the exception

    }
}