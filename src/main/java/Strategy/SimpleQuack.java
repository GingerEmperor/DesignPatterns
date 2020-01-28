package Strategy;

public class SimpleQuack implements QuackBehavour {

    @Override
    public void quack() {
        System.out.print("Quack");
        System.out.println("Quack");
    }
}
