package solid.liskov_substitution;

import solid.liskov_substitution.problem.Rectangle;
import solid.liskov_substitution.problem.Square;
import solid.liskov_substitution.solution.Shape;

public class Application {
    public static void main(String[] args) {
        // Versão problemática
        Rectangle r = new Square(); // parece ok...
        r.setWidth(4);
        r.setHeight(5);
        // Esperado: 4*5=20. Real: 5*5=25. Contrato violado.
        System.out.println(r.area());


        // Versão com solução
        Shape s1 = new solid.liskov_substitution.solution.Rectangle(4, 5);
        Shape s2 = new solid.liskov_substitution.solution.Square(5);
        System.out.println(s1.area()); // 20
        System.out.println(s2.area()); // 25
    }
}
