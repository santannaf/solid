package solid.dependency_inversion.solution;

// Implementações de baixo nível
public class EmailMessageSender implements MessageSender {
    public void send(String to, String msg) {
        System.out.println("EMAIL -> " + to + ": " + msg);
    }
}
