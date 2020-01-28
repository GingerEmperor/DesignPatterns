package IteratorPattern;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu caffeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu,Menu caffeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.caffeMenu=caffeMenu;
    }

    public void printMenu(){

        System.out.println("---BREAKFAST--");
        printMenu(pancakeHouseMenu.createIterator());
        System.out.println("--Lunch--");
        printMenu(dinerMenu.createIterator());
        System.out.println("--Dinner--");
        printMenu(caffeMenu.createIterator());
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuItem  nextItem = (MenuItem) iterator.next();
            System.out.println( nextItem.getName()+"\t\t\t"+nextItem.getDescription()+"\t\t\t"+nextItem.getPrice());
        }
    }
}
