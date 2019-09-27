package examples;

public class MessageClient {

    public String sendMessage(IMessage message) {

        String contents = message.getContents();
        String author = message.getAuthor();
        int length = message.getLength();

        // do something to send the message
        return String.format("%s sent a message with contents '%s' and length %d", author, contents, length);
    }
}
