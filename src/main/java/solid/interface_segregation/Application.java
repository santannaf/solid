package solid.interface_segregation;

import solid.interface_segregation.solution.OfficeAllInOne;
import solid.interface_segregation.solution.PrintService;
import solid.interface_segregation.solution.Printer;
import solid.interface_segregation.solution.SimplePrinter;

public class Application {
    public static void main(String[] args) {
        // Dispositivo simples: só imprime
        Printer simples = new SimplePrinter();

        // Dispositivo completo: imprime, escaneia e envia fax
        OfficeAllInOne allInOne = new OfficeAllInOne();

        // Serviços dependem apenas das capacidades necessárias
        PrintService printComSimples = new PrintService(simples);         // OK: só precisa de Printer
        PrintService printComAllInOne = new PrintService(allInOne);       // OK: também é Printer

        // Uso prático
        printComSimples.imprimirContrato("Contrato #123");
        printComAllInOne.imprimirContrato("Contrato #456");
    }
}
