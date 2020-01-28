package Decorator;

public class Chocolate extends Decorator {
    public Chocolate(Coffe coffe) {
        super(coffe);
    }

    @Override
    String getDescription() {
        return coffe.getDescription()+" with chocolate";
    }

    @Override
    double getCost() {
        return coffe.getCost()+0.80;
    }
}
