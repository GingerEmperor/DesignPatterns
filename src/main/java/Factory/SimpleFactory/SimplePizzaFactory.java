package Factory.SimpleFactory;

import Factory.CheesePizza;
import Factory.PeperoniPizza;
import Factory.Pizza;

 class SimplePizzaFactory {
    static Pizza pizza;

    static Pizza createPizza(String type){
        if(type.equals("cheese")){
            pizza=new CheesePizza();
        }else if (type.equals("peperoni")){
            pizza=new PeperoniPizza();
        }

        return pizza;
    }
}
