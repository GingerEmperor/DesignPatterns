package IteratorPattern;

public class WaitressTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu=new PancakeHouseMenu();
        Menu dinerMenu=new DinerMenu();
        Menu caffeMenu=new CaffeMenu();

        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu,caffeMenu);
        waitress.printMenu();
    }
}
