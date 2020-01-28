package Factory.SimpleFactory;

import Factory.Pizza;

 class MainPizza {
    public static void main(String[] args) {
        PizzaShop pizzaShop = new PizzaShop();
        Pizza pizza= pizzaShop.orderPizza();
        System.out.println("Your "+pizza.description()+" is done");


    }
}
