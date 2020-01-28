package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subj {
    double temperature;
    double humidity;
    double pressure;

    List<Observers> observers=new ArrayList<Observers>();
    public void registerObserver(Observers ob){
        if(!observers.contains(ob)){
            observers.add(ob);
        }
    }
    public void removeObserver(Observers ob){
        if(observers.contains(ob)){
            observers.remove(ob);
        }
    }
    public void uppdateObservers(){
        for (int i = 0; i <observers.size() ; i++) {
            observers.get(i).uppdate(temperature,humidity,pressure);
        }
    }

    public void setData( double temperature, double humidity, double pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        uppdateObservers();
    }

}
