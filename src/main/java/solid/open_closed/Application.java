package solid.open_closed;

import solid.open_closed.solution.CalculadoraDescontos;
import solid.open_closed.solution.DescontoCupom10;
import solid.open_closed.solution.DescontoVip;

public class Application {
    public static void main(String[] args) {
        CalculadoraDescontos calc = new CalculadoraDescontos(
                new DescontoCupom10(), new DescontoVip()
        );
        System.out.println(calc.aplicarDesconto("VIP", 100.0));
    }
}
