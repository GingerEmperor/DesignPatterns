package Comand;

public class LightOnComand implements Comand {
    Light light;


    public LightOnComand(Light light){
        this.light=light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
