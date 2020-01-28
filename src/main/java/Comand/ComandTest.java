package Comand;

import Comand.Fan.*;

public class ComandTest {
    public static void main(String[] args) {
        Remote remote=new Remote();

        Light light=new Light();
        Stereo stereo=new Stereo();
        CeilingFan ceilingFan=new CeilingFan();

        LightOnComand lightOnComand =new LightOnComand(light);
        LightOffComand lightOffComand=new LightOffComand(light);
        StereoOnComand stereoOnComand =new StereoOnComand(stereo);
        StereoOffComand stereoOffComand=new StereoOffComand(stereo);
        CeilingFanOnComand ceilingFanOnComand=new CeilingFanOnComand(ceilingFan);
        CeilingFanOffComand ceilingFanOffComand=new CeilingFanOffComand(ceilingFan);
        CeilingFanLowComand ceilingFanLowComand=new CeilingFanLowComand(ceilingFan);
        CeilingFanMediumComand ceilingFanMediumComand=new CeilingFanMediumComand(ceilingFan);
        CeilingFanHightComand ceilingFanHightComand=new CeilingFanHightComand(ceilingFan);


        remote.setComands(1, lightOnComand,lightOffComand);
        remote.setComands(2,stereoOnComand,stereoOffComand);
        remote.setComands(3,ceilingFanOnComand,ceilingFanOffComand);
        remote.setComands(4,ceilingFanLowComand,ceilingFanOffComand);
        remote.setComands(5,ceilingFanMediumComand,ceilingFanOffComand);
        remote.setComands(6,ceilingFanHightComand,ceilingFanOffComand);

        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);

        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);

        remote.onButtonWasPressed(2);

        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);



        //remote.onButtonWasPressed(2);
//        remote.offButtonWasPressed(2);
//        remote.offButtonWasPressed(1);
//        remote.onButtonWasPressed(5);
//        remote.onButtonWasPressed(6);
        System.out.println("------------------------");
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();
       remote.undoButtonWasPresed();

       remote.undoButtonWasPresed();


    }
}
