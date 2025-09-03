package solid.open_closed.solution;

public class DiscountVip implements DiscountRule {
    @Override public boolean accept(String tipo) { return "VIP".equals(tipo); }
    @Override public double apply(double valor) { return valor * 0.85; }
}
