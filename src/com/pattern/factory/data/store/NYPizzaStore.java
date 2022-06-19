package com.pattern.factory.data.store;

import com.pattern.factory.data.item.ingredients.IngredientsFactory;
import com.pattern.factory.data.item.pizza.NYCheeseStylePizza;
import com.pattern.factory.data.item.pizza.NYVeggieStylePizza;
import com.pattern.factory.data.item.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(IngredientsFactory factory) {
        this.setIngredientsFactory(factory);
    }

    @Override
    protected Pizza createPizza(String type) {  // Factory Method
        Pizza pizza = null;
        if(type.equals("Cheese")) {
            pizza = new NYCheeseStylePizza();
        } else if(type.equals("Veggie")) {
            pizza = new NYVeggieStylePizza();
        }
        return pizza;
    }
    
}
