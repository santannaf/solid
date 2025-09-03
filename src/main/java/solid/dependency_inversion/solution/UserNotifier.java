package solid.dependency_inversion.solution;

// Alto nível depende da ABSTRAÇÃO
public record UserNotifier(MessageSender sender) {
    // injeção manual
    public void notify(String userContact, String msg) {
        sender.send(userContact, msg);
    }
}
