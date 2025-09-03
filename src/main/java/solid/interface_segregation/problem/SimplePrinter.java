package solid.interface_segregation.problem;

/*
* Problema: uma interface com muitos métodos força clientes a implementar métodos que não usam.
* */

// Máquina simples não tem fax -> implementação “falsa”
class SimplePrinter implements MultiFuncMachine {
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
        throw new UnsupportedOperationException("Sem fax");
    }
}