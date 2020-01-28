package TemplateMethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        Drink drink1=new Tea();
        Drink drink2=new Coffe();

        drink1.predareDrink();
        drink2.predareDrink();

    }
}
