package Factory.FactoryMethod;

import Factory.Pizza;

public abstract class PizzaShop {

    PizzaFactory pizzaFactory;
    Pizza pizza;
    Pizza orderPizza(String type){

        pizza=pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
