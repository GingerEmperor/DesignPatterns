package Factory.SimpleFactory;

import Factory.Pizza;
 class PizzaShop {
    Pizza pizza;
    Pizza orderPizza(){
        //
        pizza=SimplePizzaFactory.createPizza("cheese");

        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
