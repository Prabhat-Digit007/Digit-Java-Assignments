import java.util.ArrayList;
import java.util.List;


interface WeatherData{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}


class WeatherDataImpl implements WeatherData {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataImpl() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyObservers();
    }
}
interface Observer{
    public void update(float temperature, float humidity, float pressure);
}

class TemperatureDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Temperature Display: " + temperature);
    }
}

class HumidityDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Humidity Display: " + humidity);
    }
}

class PressureDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Pressure Display: " + pressure);
    }
}


public class Main1 {
    public static void main(String[] args) {
        WeatherDataImpl weatherData = new WeatherDataImpl();

        Observer tempDisplay = new TemperatureDisplay();
        Observer humidityDisplay = new HumidityDisplay();
        Observer pressureDisplay = new PressureDisplay();

        weatherData.addObserver(tempDisplay);
        weatherData.addObserver(humidityDisplay);
        weatherData.addObserver(pressureDisplay);

        weatherData.setTemperature(25.0f);
        weatherData.setHumidity(60.0f);
        weatherData.setPressure(1013.0f);
    }
}
