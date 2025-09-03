package solid.open_closed.problem;

/*
* Problema: toda vez que surge um novo tipo de desconto,
* precisamos editar um if/else gigante, arriscando regressões.
* */

// Violação de OCP: precisa editar o método para cada novo tipo
public class DiscountCalculator {
    public double applyDiscount(String tipo, double valor) {
        if ("CUPOM10".equals(tipo)) return valor * 0.9;
        else if ("VIP".equals(tipo)) return valor * 0.85;
        else if ("BLACKFRIDAY".equals(tipo)) return valor * 0.7;
        // ...novos tipos exigem mudar aqui
        return valor;
    }
}
