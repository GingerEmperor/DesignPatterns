package Factory.FactoryMethod;

import Factory.Pizza;

import java.util.logging.Logger;

public class MainPizza {


    public static void main(String[] args) {
        Logger lg= Logger.getAnonymousLogger();
        Logger lg2=Logger.getLogger("");
        lg2.info("32342");
        lg.info("sdsa");
        lg.info("sdsa1");
        Pizza pizza;
        PizzaShop pizzaShop=new ChicagoPizzaShop();
        pizza=pizzaShop.orderPizza("cheese");

        pizzaShop=new NYPizzaShop();
        pizza=pizzaShop.orderPizza("peperoni");
    }
}
