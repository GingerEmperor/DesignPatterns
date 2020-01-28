package Comand.Fan;

import Comand.Comand;

public class CeilingFanHightComand extends AbstractFanComand {


    public CeilingFanHightComand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    public void execute() {
        previousSpeed=ceilingFan.getFanSpeed();
        ceilingFan.setLowFanSpeed();
    }

    public void undo() {
        if(previousSpeed==CeilingFan.Speed.LOW){
            ceilingFan.setLowFanSpeed();
        }else if(previousSpeed==CeilingFan.Speed.MEDIUM){
            ceilingFan.setMediumFanSpeed();
        }else if (previousSpeed==CeilingFan.Speed.HIGHT){
            ceilingFan.setHightFanSpeed();
        }
    }
}
