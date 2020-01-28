package Facade;

import Observer.Display;

public class DVD {
    Disc disc;


    void on(){
        System.out.println("DVD is on");
    }
    void off(){
        System.out.println("DVD is off");
    }

    void playDisc(Disc disc){
        this.disc=disc;
        System.out.println("Playing: "+disc.name);
    }
}
