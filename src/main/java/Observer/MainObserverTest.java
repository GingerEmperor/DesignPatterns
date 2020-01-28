package Observer;

import java.util.ArrayList;
import java.util.List;

public class MainObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        TemperatureDisplay temperatureDisplay=new TemperatureDisplay();
        PreassureDisplay preassureDisplay=new PreassureDisplay();

        weatherData.setData(13,53,65);
        System.out.println();
        temperatureDisplay.beObserver(weatherData);
        weatherData.setData(13,53,65);
        System.out.println();
        preassureDisplay.beObserver(weatherData);
        weatherData.setData(12,53,55);
        System.out.println();
        temperatureDisplay.beFree();
        weatherData.setData(12,53,85);
        System.out.println();

    }
}
