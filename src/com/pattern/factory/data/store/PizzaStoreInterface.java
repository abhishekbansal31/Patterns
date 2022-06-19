package com.pattern.factory.data.store;

import com.pattern.factory.data.item.ingredients.IngredientsFactory;
import com.pattern.factory.data.item.pizza.Pizza;

public interface PizzaStoreInterface {
    Pizza order(String type);
    void setIngredientsFactory(IngredientsFactory factory);
}
