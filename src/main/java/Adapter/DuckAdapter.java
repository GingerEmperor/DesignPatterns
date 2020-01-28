package Adapter;

public class DuckAdapter extends Duck {
    Chicken chicken;

    DuckAdapter(Chicken chicken){
        this.chicken=chicken;
    }

    @Override
    void fly() {
        for (int i = 0; i <5 ; i++) {
            chicken.fly();
        }
    }

    @Override
    void squek() {
        chicken.voice();
    }

    @Override
    void swim() {
        System.out.println("I can't swim");
    }

    @Override
    String getName() {
        return chicken.getName();
    }
}
