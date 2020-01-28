package Factory.FactoryMethod;

import Factory.CheesePizza;
import Factory.PeperoniPizza;
import Factory.Pizza;

public class ChicagoPizzaShop extends PizzaShop {
    ChicagoPizzaShop(){
        this.pizzaFactory=new  ChicagoPizzaFactory();
    }


}
