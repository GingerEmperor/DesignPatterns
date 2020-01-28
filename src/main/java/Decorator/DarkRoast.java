package Decorator;

public class DarkRoast extends Coffe {
    @Override
    String getDescription() {
        return "Its a dark roast";
    }

    @Override
    double getCost() {
        System.out.println("Yoy need to pay: ");
        return 1.30;
    }
}
