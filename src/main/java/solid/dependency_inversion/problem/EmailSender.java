package solid.dependency_inversion.problem;

// Alto nível acoplado a baixo nível
public class EmailSender {
    public void send(String to, String msg) {
        System.out.println("Enviando EMAIL para " + to + ": " + msg);
        // imagine aqui código concreto de SMTP...
    }
}
