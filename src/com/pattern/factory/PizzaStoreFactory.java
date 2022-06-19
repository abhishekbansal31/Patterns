package com.pattern.factory;

import com.pattern.factory.data.item.ingredients.ChicagoPizzaIngredientsFactory;
import com.pattern.factory.data.item.ingredients.NYPizzaIngredientsFactory;
import com.pattern.factory.data.store.ChicagoPizzaStore;
import com.pattern.factory.data.store.NYPizzaStore;
import com.pattern.factory.data.store.PizzaStore;

public class PizzaStoreFactory {
    protected PizzaStore getPizzaStore(String country) {
        PizzaStore store = null;
        if(country.equals("NewYork")) {
            store = new NYPizzaStore(new NYPizzaIngredientsFactory());
        } else if(country.equals("Chicago")) {
            store = new ChicagoPizzaStore(new ChicagoPizzaIngredientsFactory());
        }
        return store;
    }
}
