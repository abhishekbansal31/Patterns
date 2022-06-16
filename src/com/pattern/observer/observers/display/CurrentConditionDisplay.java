package com.pattern.observer.observers.display;

import com.pattern.observer.observers.WeatherObserver;
import com.pattern.observer.subject.WeatherDataSubject;

public class CurrentConditionDisplay extends WeatherObserver implements DisplayElement {

    public CurrentConditionDisplay(WeatherDataSubject subject) {
        try {
            this.setSubject(subject);
            this.update();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Condition:");
        System.out.println("Temperature: "+this.getSubject().getTemperature());
        System.out.println("Humidity: "+this.getSubject().getHumidity());
        System.out.println("Pressure: "+this.getSubject().getPressure());
        System.out.println();
    }
    
}
