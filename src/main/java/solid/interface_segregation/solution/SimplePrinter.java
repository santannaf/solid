package solid.interface_segregation.solution;

public class SimplePrinter implements Printer {
    @Override
    public void print(String doc) {
        System.out.println("Imprimindo: " + doc);
    }
}
