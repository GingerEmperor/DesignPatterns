package Comand;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Remote {
    Comand[] onComands;
    Comand[] offComands;

    Comand undoComand;
    NoComand noComand;

    Stack<Comand> undoComandStack;
    Remote(){
        onComands=new Comand[7];
        offComands=new Comand[7];

        noComand=new NoComand();
        undoComand=noComand;
        undoComandStack=new Stack<Comand>();

        for (int i = 0; i <onComands.length ; i++) {
            onComands[i]=noComand;
            offComands[i]=noComand;
        }
    }


    void setComands(int slot, Comand onComand,Comand offComand){
        onComands[slot]=onComand;
        offComands[slot]=offComand;

    }


    void onButtonWasPressed(int slot){
        onComands[slot].execute();
        undoComandStack.push(onComands[slot]);
        //undoComand=onComands[slot];
    }
    void offButtonWasPressed(int slot){
        offComands[slot].execute();
        //undoComand=offComands[slot];
        undoComandStack.push(offComands[slot]);
    }


    void undoButtonWasPresed(){
        //undoComand.undo();
        try {


            if (undoComandStack.peek() != null)
                undoComandStack.pop().undo();
        }catch (Exception e){}
    }


}
