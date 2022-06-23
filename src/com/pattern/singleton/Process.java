package com.pattern.singleton;

public class Process implements Runnable {
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println("Thread: "+Thread.currentThread().getName() + " , Singleton Instance: "+instance.hashCode());
        instance.process();
    }
}
