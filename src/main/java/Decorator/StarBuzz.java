package Decorator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StarBuzz {

    public static void main(String[] args) {
//        Coffe espresso=new Espresso();
//        espresso= new Milk(espresso);
//        espresso= new Milk(espresso);
//        espresso= new Milk(espresso);
//        espresso=new Chocolate(espresso);
//
//        System.out.println(espresso.getDescription());
//        System.out.println(espresso.getCost());


        Map<String,Coffe>menu=new HashMap<String, Coffe>();
        Map<String,Decorator>adds=new HashMap<String, Decorator>();

        menu.put("espresso",new Espresso());
        menu.put("darkRoast",new DarkRoast());

      //  adds.put("milk",new Milk());

        File file = new File("C:\\Users\\crm0176\\IdeaProjects\\MyPatterns\\src\\main\\java\\Decorator\\order.txt");
        Scanner scanner=null;
        try {
            scanner=new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File was not find");
        }

        String potentialOrder=null;
        if(scanner.hasNext())
            potentialOrder=scanner.next();
        Coffe realOrder=menu.get(potentialOrder);






        while (scanner.hasNext()){
            potentialOrder=scanner.next();
            if(potentialOrder.equals("milk")){
                realOrder=new Milk(realOrder);
            }
            if(potentialOrder.equals("chocolate")){
                realOrder=new Chocolate(realOrder);
            }

        }

        System.out.println(realOrder.getDescription());
        System.out.println(realOrder.getCost());

    }
}
