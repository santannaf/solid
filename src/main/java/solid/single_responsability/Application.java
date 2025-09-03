package solid.single_responsability;

import solid.single_responsability.solution.ArquivoWriter;
import solid.single_responsability.solution.CalculadoraVendas;
import solid.single_responsability.solution.RelatorioConsole;

public class Application {
    public static void main(String[] args) {
        CalculadoraVendas calc = new CalculadoraVendas();
        ArquivoWriter writer = new ArquivoWriter();
        RelatorioConsole console = new RelatorioConsole();

        double total = calc.calcularTotal();
        writer.salvar("relatorio.txt", "total=" + total);
        console.imprimir(total);
    }
}
