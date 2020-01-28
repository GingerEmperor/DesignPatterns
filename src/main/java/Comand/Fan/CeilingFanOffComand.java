package Comand.Fan;

import Comand.Comand;

public class CeilingFanOffComand implements Comand {
    CeilingFan ceilingFan;

    public CeilingFanOffComand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }

    public void undo() {
        ceilingFan.on();
    }
}
