package com.pattern.observer.observers;

import com.pattern.observer.subject.WeatherDataSubject;

public abstract class WeatherObserver implements ObserverInterface {
    private WeatherDataSubject subject;

    protected WeatherDataSubject getSubject() {
        return subject;
    }

    public void setSubject(WeatherDataSubject subject) throws Exception {
        if(subject!=null) {
            this.removeObserver();
            this.subject = subject;
            this.subject.registerObserver(this);
        } else {
            throw new Exception("Subject should not be null.");
        }
    }

    public void removeObserver() {
        if(this.subject!=null) {
            this.subject.removeObserver(this);
        }
    }
}
