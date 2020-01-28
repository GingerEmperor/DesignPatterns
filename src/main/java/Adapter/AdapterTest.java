package Adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterTest {
    public static void main(String[] args) {
        List<Duck>ducks=new ArrayList<Duck>();

        Duck duck=new Duck();
        Chicken chicken=new Chicken();

        duck.squek();
        chicken.voice();

        ducks.add(duck);

        DuckAdapter adapterChicken=new DuckAdapter(chicken);

        ducks.add(adapterChicken);

        for (Duck duckling:ducks) {
            System.out.println();
            System.out.println(duckling.getName());
            duckling.squek();
            duckling.fly();
            duckling.swim();

        }


    }

}
