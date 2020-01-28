package Strategy;



public class SimpleDuck extends Duck {
    public SimpleDuck(){
        super(new SimpleQuack(),new SimpleFly());
    }
}
