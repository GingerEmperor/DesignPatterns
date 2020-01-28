package Comand.Fan;

import Comand.Comand;

public class CeilingFanOnComand implements Comand {
    CeilingFan ceilingFan;
    CeilingFan.Speed previousSpeed;
    public CeilingFanOnComand(CeilingFan ceilingFan) {
        this.ceilingFan=ceilingFan;
    }

    public void execute() {
        ceilingFan.on();
    }

    public void undo() {
        ceilingFan.off();
    }
}
