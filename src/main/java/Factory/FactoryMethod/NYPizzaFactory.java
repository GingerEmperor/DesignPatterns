package Factory.FactoryMethod;

import Factory.CheesePizza;
import Factory.PeperoniPizza;
import Factory.Pizza;

public class NYPizzaFactory extends PizzaFactory {
    NYPizzaFactory(){
        this.diametr=10;
        this.testo="тонкое тесто";
        this.cheeseCounter="мало сыра";
        this.technology="NY технология";

    }


}
