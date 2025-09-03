package solid.dependency_inversion.solution;

// Abstração
public interface MessageSender {
    void send(String to, String msg);
}