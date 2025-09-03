package solid.open_closed;

import solid.open_closed.solution.DiscountCalculator;
import solid.open_closed.solution.DiscountCupom10;
import solid.open_closed.solution.DiscountVip;

public class Application {
    public static void main(String[] args) {
        DiscountCalculator calc = new DiscountCalculator(
                new DiscountCupom10(), new DiscountVip()
        );
        System.out.println(calc.applyDiscount("VIP", 100.0));
    }
}
