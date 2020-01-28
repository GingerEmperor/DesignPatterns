package Strategy;

public class MuteQuack implements QuackBehavour {
    @Override
    public void quack() {
        System.out.println("//Silence//");
    }
}
