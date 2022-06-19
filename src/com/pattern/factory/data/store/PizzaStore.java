package com.pattern.factory.data.store;

import com.pattern.factory.data.item.ingredients.IngredientsFactory;
import com.pattern.factory.data.item.pizza.Pizza;

public abstract class PizzaStore implements PizzaStoreInterface {
    private IngredientsFactory ingredientsFactory = null;
    
    public Pizza order(String type) {
        Pizza pizza = createPizza(type);
        if(pizza!=null) {
            pizza.prepare(this.getIngredientsFactory());
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
    protected abstract Pizza createPizza(String type);


    private IngredientsFactory getIngredientsFactory() {
        return this.ingredientsFactory;
    }

    @Override
    public void setIngredientsFactory(IngredientsFactory factory) {
        this.ingredientsFactory = factory;
    }
}
