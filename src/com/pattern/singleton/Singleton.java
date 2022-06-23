package com.pattern.singleton;

public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance==null) {
            synchronized(Singleton.class) {
                if(instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public synchronized void process() {
        System.out.println("processing... "+Thread.currentThread().getName());
        try{
            Thread.sleep(1000); // API calls or IO operations
        } catch(Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("Completed process...  "+Thread.currentThread().getName());
    }
}
