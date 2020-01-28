package Decorator;

public abstract class Decorator extends Coffe {

    Coffe coffe;

    Decorator(Coffe coffe){
        this.coffe=coffe;
    }
}
