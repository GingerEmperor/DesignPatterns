package Facade;

public class TV {
    DVD dvd;

    void on(){
        System.out.println("TV is on");
    }
    void off(){
        System.out.println("TV is off");
    }

    void setDVD(DVD dvd){
        this.dvd=dvd;
    }
}
