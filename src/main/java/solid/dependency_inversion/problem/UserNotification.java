package solid.dependency_inversion.problem;

/*
* Problema: módulo de alto nível depende de implementação concreta de baixo nível,
* dificultando testes e troca de tecnologia.
* */

public class UserNotification {
    private final EmailSender email = new EmailSender(); // ACOPLADO
    public void notificar(String userEmail, String msg) {
        email.send(userEmail, msg);
    }
}
