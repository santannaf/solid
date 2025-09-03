package solid.open_closed.solution;

public interface RegraDesconto {
    boolean aceita(String tipo);
    double aplicar(double valor);
}
