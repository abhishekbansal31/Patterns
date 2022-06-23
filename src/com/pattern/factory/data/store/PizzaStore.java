package com.pattern.factory.data.store;

import com.pattern.factory.data.item.ingredients.PizzaIngredientsFactory;
import com.pattern.factory.data.item.pizza.Pizza;

public abstract class PizzaStore implements PizzaStoreInterface {
    private PizzaIngredientsFactory ingredientsFactory = null;
    
    public Pizza order(String type) throws Exception {
        Pizza pizza = createPizza(type);
        if(pizza!=null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            throw new Exception("Unknown type of Pizza: "+type);
        }
        return pizza;
    }
    protected abstract Pizza createPizza(String type);   // Factory Method


    protected PizzaIngredientsFactory getIngredientsFactory() {
        return this.ingredientsFactory;
    }

    @Override
    public void setIngredientsFactory(PizzaIngredientsFactory factory) {
        this.ingredientsFactory = factory;
    }
}
