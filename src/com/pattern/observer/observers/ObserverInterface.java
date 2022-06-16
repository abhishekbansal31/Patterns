package com.pattern.observer.observers;

import com.pattern.observer.subject.WeatherDataSubject;

public interface ObserverInterface {
    void setSubject(WeatherDataSubject subject) throws Exception;
    public void update();
    public void removeObserver();
}
