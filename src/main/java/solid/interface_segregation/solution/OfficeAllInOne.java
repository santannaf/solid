package solid.interface_segregation.solution;

public class OfficeAllInOne implements Printer, ScannerDevice, Fax {
    @Override
    public void print(String doc) {
        System.out.println("Imprimindo: " + doc);
    }

    @Override
    public void scan(String doc) {
        System.out.println("Escaneando: " + doc);
    }

    @Override
    public void fax(String doc) {
        System.out.println("Enviando fax: " + doc);
    }
}
