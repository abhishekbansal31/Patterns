package com.pattern.factory.data.item.pizza;

import com.pattern.factory.data.item.ingredients.PizzaIngredientsFactory;

public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
    void setIngredientsFactory(PizzaIngredientsFactory factory) throws NullPointerException ;
}
