package solid.single_responsability.problem;

import java.io.PrintWriter;

/*
* PROBLEMA: A classe "RelatorioVendas" faz coisas demais (regras de negócio + I/O + formatação).
* Isso dificulta testes, reaproveitamento e manutenção.
* Violação de SRP: tudo em uma classe
* */

public class RelatorioVendas {
    public void gerar() {
        // 1) Regras de negócio
        double total = calcularTotal();
        // 2) Persistência
        salvarEmDisco("total=" + total);
        // 3) Apresentação
        System.out.println("Relatório: total=" + total);
    }

    private double calcularTotal() {
        /* ... soma itens, impostos ... */ return 123.45;
    }

    private void salvarEmDisco(String conteudo) {
        try (PrintWriter pw = new PrintWriter("relatorio.txt")) {
            pw.println(conteudo);
        } catch (Exception e) { //noinspection CallToPrintStackTrace
            e.printStackTrace(); }
    }
}
