package com.pattern.factory;

import java.util.Scanner;

import com.pattern.factory.data.store.PizzaStore;

public class PizzaStoreMain {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String country = sc.nextLine();

            PizzaStoreProvider factory = new PizzaStoreFactory();
            PizzaStore store = factory.getPizzaStore(country);

            if(store!=null) {
                store.order("Cheese");
                store.order("Veggie");
            } else {
                System.out.println(country + " : Out of service");
            }

            country = sc.nextLine();
            store = factory.getPizzaStore(country);

            if(store!=null) {
                store.order("Cheese");
                store.order("Veggie");
            } else {
                System.out.println(country + " : Out of service");
            }

            sc.close();
        } catch(Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
        
    }
}
