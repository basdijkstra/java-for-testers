package examples;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class MockitoExampleTest {

    @Test
    public void testSendMessageUsingMock() {

        // ARRANGE
        WhatsApp messageClient = new WhatsApp();

        // Mock away the behaviour of the IMessage class
        Message message = mock(Message.class);

        // Define the behaviour of the mock
        when(message.getContents()).thenReturn("This is a mock message");
        when(message.getAuthor()).thenReturn("Mocky McMock");
        when(message.getLength()).thenReturn(22);

        // ACT
        String contents = messageClient.sendMessage(message);

        // ASSERT
        Assert.assertEquals(
            "Mocky McMock sent a message with contents 'This is a mock message' and length 22",
            contents
        );
    }
}
