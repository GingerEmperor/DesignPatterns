package Comand.Fan;

import Comand.Comand;

public class CeilingFanMediumComand extends AbstractFanComand {


    public CeilingFanMediumComand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    public void execute() {
        previousSpeed=ceilingFan.getFanSpeed();
        ceilingFan.setMediumFanSpeed();
    }


}
