package answers;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.mockito.Mockito.*;

public class SteeringWheelTest {

    @Test
    public void testSteeringLeft() throws Exception {

        // ARRANGE - Create a new instance of the SteeringWheel class
        SteeringWheel steeringWheel = new SteeringWheel();

        // ARRANGE - Create a mock for the IWheels object
        IWheels wheels = mock(IWheels.class);

        // ARRANGE - Set the behavior of the mock so that a call to turnLeft returns "turned left"
        when(wheels.turnLeft()).thenReturn("turned left");

        // ACT - Steer to the left and store the result in a String variable
        String feedback = steeringWheel.steer("left", wheels);

        // ASSERT - Assert that the feedback equals "turned left"
        Assert.assertEquals("turned left", feedback);

        // ASSERT - Assert that the turnLeft() method of the mock was called exactly once
        // ASSERT - Assert that the turnRight() method of the mock was not called
        verify(wheels, times(1)).turnLeft();
        verify(wheels, never()).turnRight();
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testSteeringThrowsException() throws Exception {

        // ARRANGE - Tell the exceptionRule to expect an exception of type UnsupportedOperationException.class
        exceptionRule.expect(UnsupportedOperationException.class);

        // ARRANGE - Create a new instance of the SteeringWheel class
        SteeringWheel steeringWheel = new SteeringWheel();

        // ARRANGE - Create a mock for the IWheels object
        IWheels wheels = mock(IWheels.class);

        // ARRANGE - Set the behavior of the mock so that a call to turnLeft returns "turned left"
        when(wheels.turnLeft()).thenThrow(UnsupportedOperationException.class);

        // ACT - Steer to the left to trigger the exception
        String feedback = steeringWheel.steer("left", wheels);
    }
}
