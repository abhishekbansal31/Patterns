package com.pattern.factory.data.store;

import com.pattern.factory.data.item.ingredients.PizzaIngredientsFactory;
import com.pattern.factory.data.item.pizza.Pizza;

public interface PizzaStoreInterface {
    Pizza order(String type) throws Exception;
    void setIngredientsFactory(PizzaIngredientsFactory factory);
}
