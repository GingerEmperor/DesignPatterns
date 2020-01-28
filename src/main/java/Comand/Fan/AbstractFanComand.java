package Comand.Fan;

import Comand.Comand;

public abstract class AbstractFanComand implements Comand {
    CeilingFan ceilingFan;
    CeilingFan.Speed previousSpeed;

    public AbstractFanComand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
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
