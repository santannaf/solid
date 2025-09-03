package solid.dependency_inversion;

import solid.dependency_inversion.solution.EmailMessageSender;
import solid.dependency_inversion.solution.SmsMessageSender;
import solid.dependency_inversion.solution.UserNotifier;

public class Application {
    public static void main(String[] args) {
        // Trocando implementação sem mudar o alto nível
        UserNotifier porEmail = new UserNotifier(new EmailMessageSender());
        porEmail.notify("ana@exemplo.com", "Bem-vinda!");

        UserNotifier porSms = new UserNotifier(new SmsMessageSender());
        porSms.notify("+55 21 99999-9999", "Seu código é 1234");
    }
}
