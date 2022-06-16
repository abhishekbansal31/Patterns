package com.pattern.observer.subject;

import com.pattern.observer.observers.WeatherObserver;

public interface SubjectInterface {
    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}
