package solid.open_closed.solution;

// Novo desconto? Crie outra classe, sem tocar na calculadora.
public record CalculadoraDescontos(RegraDesconto... regras) {
    public double aplicarDesconto(String tipo, double valor) {
        for (RegraDesconto r : regras) if (r.aceita(tipo)) return r.aplicar(valor);
        return valor;
    }
}
