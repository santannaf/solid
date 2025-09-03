package solid.open_closed.solution;

public class DescontoVip implements RegraDesconto{
    @Override public boolean aceita(String tipo) { return "VIP".equals(tipo); }
    @Override public double aplicar(double valor) { return valor * 0.85; }
}
