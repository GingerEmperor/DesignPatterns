package Facade;

public class Audio {

    void on(){
        System.out.println("Audio is on");
    }
    void off(){
        System.out.println("Audio is off");
    }

    void setVolume(int volume){
        System.out.println("Volume is "+volume);
    }

}
