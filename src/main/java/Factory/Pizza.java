package Factory;

public abstract class Pizza {
    int diametr;
    String testo;
    String cheeseCounter;
    String technology;

    public Pizza() {}

    public abstract String description();

    public void prepare(){
//        System.out.println("-----------");
//        System.out.println("Pizza is preparing");
//        System.out.println("The "+description()+" is preparing by "+technology+" technology:");
//        System.out.println(testo+" "+cheeseCounter+" "+diametr);
//        System.out.println("-----------");
    }

    public void cut(){
        System.out.println("Cut cut cut");
    }
    public void box(){
        System.out.println("Put the pizza in the box");
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public void setCheeseCounter(String cheeseCounter) {
        this.cheeseCounter = cheeseCounter;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
