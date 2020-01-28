package Decorator;

public class Espresso extends Coffe {
    @Override
    String  getDescription() {
        return "Its a espresso";
    }

    @Override
    double getCost() {
        System.out.println("Yoy need to pay: ");
        return 1.99;
    }
}
