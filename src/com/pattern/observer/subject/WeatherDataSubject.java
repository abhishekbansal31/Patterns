package com.pattern.observer.subject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.pattern.observer.observers.WeatherObserver;

public class WeatherDataSubject implements SubjectInterface {
    private Set<WeatherObserver> observers = new HashSet<WeatherObserver>();
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherDataSubject(double temperature, double humidity, double pressure) {
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        this.setPressure(pressure);
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
        
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<WeatherObserver> itr = observers.iterator();
        while(itr.hasNext()) {
            itr.next().update();
        }
    }

    public void measurementsChanged(double temperature, double humidity, double pressure) {
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        this.setPressure(pressure);
        this.notifyObservers();
    }

    /**
     * @return double return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    protected void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return double return the humidity
     */
    public double getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    protected void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    /**
     * @return double return the pressure
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * @param pressure the pressure to set
     */
    protected void setPressure(double pressure) {
        this.pressure = pressure;
    }

    
}
