package com.pattern.factory.data.item.pizza;

import com.pattern.factory.data.item.ingredients.IngredientsFactory;

public class NYCheeseStylePizza extends PizzaAbstract {

    @Override
    public void prepare(IngredientsFactory factory) {
        // TODO Auto-generated method stub
        this.setIngredientsFactory(factory);
        
    }

    @Override
    public void bake() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cut() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void box() {
        // TODO Auto-generated method stub
        
    }
    
}
