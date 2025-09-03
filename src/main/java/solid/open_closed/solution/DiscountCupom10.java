package solid.open_closed.solution;

public class DiscountCupom10 implements DiscountRule {
    @Override
    public boolean accept(String tipo) {
        return "CUPOM10".equals(tipo);
    }

    @Override
    public double apply(double valor) {
        return valor * 0.9;
    }
}
