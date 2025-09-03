package solid.single_responsability;

import solid.single_responsability.solution.FileWriter;
import solid.single_responsability.solution.SalesCalculator;
import solid.single_responsability.solution.ConsoleReport;

public class Application {
    public static void main(String[] args) {
        SalesCalculator calc = new SalesCalculator();
        FileWriter writer = new FileWriter();
        ConsoleReport console = new ConsoleReport();

        double total = calc.calculateTotal();
        writer.save("relatorio.txt", "total=" + total);
        console.print(total);
    }
}
