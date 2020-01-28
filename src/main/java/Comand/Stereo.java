package Comand;

public class Stereo {
    boolean stereoIsOn;
    int volume;

    public void on(){
        stereoIsOn=true;
        System.out.println("Stereo is on");
    }

    public void off(){
        stereoIsOn=false;
        offVolume();
        System.out.println("Stereo is off");
    }

    void setVolume(int volume){
        this.volume=volume;
        System.out.println("volume is "+volume);
    }

    void offVolume(){
        setVolume(0);
        System.out.println("Volume is off");
    }
}
