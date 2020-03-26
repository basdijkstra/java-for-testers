package examples;

public class WhatsApp {

    public String sendMessage(Message message) {

        String contents = message.getContents();
        String author = message.getAuthor();
        int length = message.getLength();

        // do something to send the message
        return String.format("%s sent a message with contents '%s' and length %d", author, contents, length);
    }
}

