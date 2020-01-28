package Observer;

public class PreassureDisplay extends Display implements Observers {
    double preasure;
    Subj subject;


    public void display() {
        System.out.println("---PreassureDisplay---");
        System.out.println("Current preassure is "+preasure);
     //   System.out.println();
    }


    public void beObserver(Subj subj) {
        this.subject=subj;
        subject.registerObserver(this);
    }

    public void beFree() {
        subject.removeObserver(this);
        subject=null;
    }

    public void uppdate(double temperature, double humidity, double pressure) {
        this.preasure=pressure;
        display();
    }


}
