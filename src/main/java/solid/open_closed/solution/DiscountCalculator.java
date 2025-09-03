package solid.open_closed.solution;

// Novo desconto? Crie outra classe, sem tocar na calculadora.
public record DiscountCalculator(DiscountRule... regras) {
    public double applyDiscount(String tipo, double valor) {
        for (DiscountRule r : regras) if (r.accept(tipo)) return r.apply(valor);
        return valor;
    }
}
