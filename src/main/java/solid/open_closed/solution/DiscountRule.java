package solid.open_closed.solution;

public interface DiscountRule {
    boolean accept(String tipo);
    double apply(double valor);
}
