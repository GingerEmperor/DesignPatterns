package Facade;

public class MovieFacade {
    Audio audio;
    DVD dvd;
    PopcornMachine popcornMachine;
    Screen screen;
    TV tv;

    public MovieFacade(Audio audio, DVD dvd, PopcornMachine popcornMachine, Screen screen, TV tv) {
        this.audio = audio;
        this.dvd = dvd;
        this.popcornMachine = popcornMachine;
        this.screen = screen;
        this.tv = tv;
    }

    void watchMovie(Disc disc){
        popcornMachine.on();
        tv.on();
        audio.on();
        audio.setVolume(5);
        dvd.on();
        tv.setDVD(dvd);
        screen.screenDown();
        popcornMachine.takePopcorn();
        dvd.playDisc(disc);
    }

    void endMovie(){
        popcornMachine.off();
        screen.screenUp();
        dvd.off();
        audio.off();
        tv.off();

    }
}
