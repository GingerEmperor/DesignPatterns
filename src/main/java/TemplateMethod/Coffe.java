package TemplateMethod;

public class Coffe extends Drink {
    @Override
    void addDrink() {
        System.out.println("Coffee is added");
    }

    @Override
    void addIngredient() {
        System.out.println("Add milk and sugar");
    }
}
