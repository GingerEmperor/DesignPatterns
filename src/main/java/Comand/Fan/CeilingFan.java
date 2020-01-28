package Comand.Fan;

public class CeilingFan {

//    public static final int OFF=0;
//    public static final int LOW=1;
//    public static final int MEDIUM=2;
//    public static final int HIGHT=3;

    enum Speed{OFF,LOW,MEDIUM,HIGHT}

    Speed fanSpeed;

    void on(){
        System.out.println("Ceiling fan is on");
        System.out.println(showSpeed());
    }

    void off(){
        System.out.println("Seiling fan is off");
    }

    void setLowFanSpeed(){
        fanSpeed=Speed.LOW;
        System.out.println(showSpeed());
    }

    void setMediumFanSpeed(){
        fanSpeed=Speed.MEDIUM;
        System.out.println(showSpeed());
    }
    void setHightFanSpeed(){
        fanSpeed=Speed.HIGHT;
        System.out.println(showSpeed());
    }

    public String showSpeed(){
        return "Seiling fan's speed is "+fanSpeed.name();
    }

    public Speed getFanSpeed(){
        return fanSpeed;
    }


}
