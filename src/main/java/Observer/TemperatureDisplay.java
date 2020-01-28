package Observer;

public class TemperatureDisplay extends Display implements Observers  {
    Subj subject;


    @Override
    public void uppdate(double temperature, double humidity, double pressure) {
        if(subject instanceof WeatherData){
            this.temperature=((WeatherData) subject).temperature;
        }
       // this.temperature=temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("---TemperatureDisplay---");
        System.out.println("Current temperature is "+temperature);
     //   System.out.println();
    }

    @Override
    public void beObserver(Subj subj) {
        this.subject=subj;
        subject.registerObserver(this);
    }

    @Override
    public void beFree() {
        subject.removeObserver(this);
        subject=null;
    }
}
