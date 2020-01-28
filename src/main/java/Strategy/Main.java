package Strategy;

public class Main {
    public static void main(String[] args) {
        Duck simpleDuck=new SimpleDuck();
        simpleDuck.display();

        Duck rubberDuck=new RubberDuck();
        rubberDuck.setQuackBehavour(new ScueteQuack());
        rubberDuck.setFlyBehavour(new CanNotFly());
        rubberDuck.display();

        rubberDuck.setQuackBehavour(new MuteQuack());
        rubberDuck.display();
    }
}
