package Comand;

public class StereoOffComand implements Comand {
    Stereo stereo;

    public StereoOffComand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
        stereo.setVolume(50);
    }
}
