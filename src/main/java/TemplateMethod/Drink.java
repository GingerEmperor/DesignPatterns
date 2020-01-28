package TemplateMethod;

public abstract class Drink {
    public final void predareDrink(){
        prepareCup();
        addDrink();
        addWater();
        addIngredient();
    }

    private void prepareCup(){
        System.out.println("Cup is prepared");
    }

    abstract void addDrink();

    private void addWater(){
        System.out.println("Hot water is added");
    }

    abstract  void addIngredient();
}
