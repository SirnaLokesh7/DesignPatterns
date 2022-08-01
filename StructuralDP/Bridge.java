public class Bridge {
    public static void main(String[] args) {
        Message message=new EmailMessage(new EmailMessageSender());
        message.sendMessage();
    }
}

abstract class Message{
    MessageSender messagesender;
    Message(MessageSender messageSender){
        this.messagesender=messageSender;
    }
    public abstract void sendMessage();
}

class TextMessage extends Message{
    public TextMessage(MessageSender messagesender){
        super(messagesender);
    }
    public void sendMessage(){
        messagesender.send();
    }

}

class EmailMessage extends Message{
    public EmailMessage(MessageSender messagesender){
        super(messagesender);
    }
    public void sendMessage(){
        messagesender.send();
    }

}
interface MessageSender{
    public void send();
}

class TextMessageSender implements MessageSender{
    @Override
    public void send() {
        System.out.println("Text Sender is sending the message");
        
    }  
}

class EmailMessageSender implements MessageSender{
    @Override
    public void send() {
        System.out.println("Email Sender is sending the message");       
    }  
}

