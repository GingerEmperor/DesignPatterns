package Strategy;

public abstract class Duck {
    QuackBehavour quackBehavour;
    FlyBehavour flyBehavour;

    public Duck(QuackBehavour quackBehavour,FlyBehavour flyBehavour){
        setFlyBehavour(flyBehavour);
        setQuackBehavour(quackBehavour);
    }
    public Duck(){ }

    public void swim(){
        System.out.println("swim swim");
    }
    public void say(){
        quackBehavour.quack();
    }

    public void fly(){
        flyBehavour.fly();
    }

    public void setFlyBehavour(FlyBehavour flyBehavour) {
        this.flyBehavour = flyBehavour;
    }

    public void setQuackBehavour(QuackBehavour quackBehavour) {
        this.quackBehavour = quackBehavour;
    }

    public QuackBehavour getQuackBehavour() {
        return quackBehavour;
    }

    public FlyBehavour getFlyBehavour() {
        return flyBehavour;
    }

    public void display(){
        System.out.println("I am "+getClass());
        swim();
        say();
        fly();
    }
}
