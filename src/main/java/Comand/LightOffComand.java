package Comand;

public class LightOffComand implements Comand {
    Light light;
    Comand undoComand;

    LightOffComand(Light light){
        this.light=light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
