package com.pattern.factory;

import com.pattern.factory.data.store.PizzaStore;

public interface PizzaStoreProvider {
    PizzaStore getPizzaStore(String country);   // Factory Method
}
