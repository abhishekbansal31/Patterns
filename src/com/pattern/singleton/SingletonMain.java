package com.pattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Process());
        Thread thread2 = new Thread(new Process());

        thread1.start();
        thread2.start();
        
    }
}
