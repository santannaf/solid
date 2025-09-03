package solid.interface_segregation.solution;

// Cliente depende de interfaces mínimas
public record PrintService(Printer printer) {
    public void imprimirContrato(String texto) {
        printer.print(texto);
    }
}
