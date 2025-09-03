package solid.open_closed.solution;

public class DescontoCupom10 implements RegraDesconto{
    @Override
    public boolean aceita(String tipo) {
        return "CUPOM10".equals(tipo);
    }

    @Override
    public double aplicar(double valor) {
        return valor * 0.9;
    }
}
