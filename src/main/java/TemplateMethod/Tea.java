package TemplateMethod;

public class Tea extends Drink {
    @Override
    void addDrink() {
        System.out.println("Add tea pack");
    }

    @Override
    void addIngredient() {
        System.out.println("Add lemon");
    }
}
