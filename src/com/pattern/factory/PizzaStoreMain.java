package com.pattern.factory;

import java.util.Scanner;

import com.pattern.factory.data.store.PizzaStore;

public class PizzaStoreMain {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String country = sc.nextLine();

            PizzaStoreFactory factory = new PizzaStoreFactory();
            PizzaStore store = factory.getPizzaStore(country);

            store.order("Cheese");
            store.order("Veggie");

            country = sc.nextLine();
            store = factory.getPizzaStore(country);

            store.order("Cheese");
            store.order("Veggie");

            sc.close();
        } catch(Exception e) {
            System.out.println("Exception");
        }
        
    }
}
