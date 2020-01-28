package Comand;

public class StereoOnComand implements Comand {
    Stereo stereo;

    public StereoOnComand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setVolume(50);
    }

    public void undo() {
        stereo.off();
    }
}
