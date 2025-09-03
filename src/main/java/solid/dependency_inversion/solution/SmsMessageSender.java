package solid.dependency_inversion.solution;

public class SmsMessageSender implements MessageSender {
    public void send(String to, String msg) {
        System.out.println("SMS -> " + to + ": " + msg);
    }
}
