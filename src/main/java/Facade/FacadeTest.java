package Facade;

public class FacadeTest {
    public static void main(String[] args) {
        Audio audio=new Audio();
        DVD dvd=new DVD();
        PopcornMachine popcornMachine=new PopcornMachine();
        Screen screen=new Screen();
        TV tv=new TV();
        Disc disc=new Disc("Lion King");

        MovieFacade movieFacade=new MovieFacade(audio,dvd,popcornMachine,screen,tv);
        movieFacade.watchMovie(disc);
        System.out.println();
        movieFacade.endMovie();
    }
}
