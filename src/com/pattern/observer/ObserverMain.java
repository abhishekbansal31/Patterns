package com.pattern.observer;

import com.pattern.observer.observers.WeatherObserver;
import com.pattern.observer.observers.display.CurrentConditionDisplay;
import com.pattern.observer.observers.display.StatisticsDisplay;
import com.pattern.observer.subject.WeatherDataSubject;

public class ObserverMain {
    public static void main(String[] args) {

        System.out.println();
        WeatherDataSubject subject = new WeatherDataSubject(30.5, 5.3, 25);

        WeatherObserver currentCondition = new CurrentConditionDisplay(subject);
        WeatherObserver statistics = new StatisticsDisplay(subject);

        System.out.println("------------------ Measurements Changed ----------------- ");

        subject.measurementsChanged(28.9, 5.2, 24.3);
        System.out.println("------------------ Measurements Changed -----------------");

        subject.measurementsChanged(29.9, 5.5, 25.3);

    }
}
