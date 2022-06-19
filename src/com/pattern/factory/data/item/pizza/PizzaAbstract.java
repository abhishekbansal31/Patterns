package com.pattern.factory.data.item.pizza;

import com.pattern.factory.data.item.ingredients.IngredientsFactory;

public abstract class PizzaAbstract implements Pizza {
    private IngredientsFactory factory = null;
    
    protected IngredientsFactory getIngredientsFactory() {
        return this.factory;
    }

    protected void setIngredientsFactory(IngredientsFactory factory) {
        this.factory = factory;
    }
}
