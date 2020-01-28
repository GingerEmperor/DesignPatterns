package Factory.FactoryMethod;

import Factory.CheesePizza;
import Factory.PeperoniPizza;
import Factory.Pizza;

public abstract class PizzaFactory {
    int diametr;
    String testo;
    String cheeseCounter;
    public String technology;

    Pizza pizza;
    Pizza createPizza(String type){

        if(type.equals("cheese")){
            pizza=new CheesePizza();
        }else if (type.equals("peperoni")){
            pizza=new PeperoniPizza();
        }
        pizza.setDiametr(diametr);
        pizza.setTechnology(technology);
        pizza.setTesto(testo);
        pizza.setCheeseCounter(cheeseCounter);


        System.out.println("-----------");
        System.out.println("Pizza is preparing");
        System.out.println("The "+pizza.description()+" is preparing by "+technology+" technology:");
        System.out.println(testo+" "+cheeseCounter+" "+diametr+" см");
        System.out.println("-----------");

        return pizza;

    };
}
