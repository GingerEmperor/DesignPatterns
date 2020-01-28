package Decorator;

public class Milk extends Decorator{
    public Milk(Coffe coffe) {
        super(coffe);
    }

    @Override
    String getDescription() {
        return coffe.getDescription()+" with milk";
    }

    @Override
    double getCost() {
        return coffe.getCost()+0.50;
    }
}
