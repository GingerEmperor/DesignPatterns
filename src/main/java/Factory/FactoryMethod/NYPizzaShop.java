package Factory.FactoryMethod;

public class NYPizzaShop extends PizzaShop {
    NYPizzaShop(){
        this.pizzaFactory=new  NYPizzaFactory();
    }


}
