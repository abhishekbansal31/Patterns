package com.pattern.factory.data.item.pizza;

import com.pattern.factory.data.item.ingredients.PizzaIngredientsFactory;

public class NYCheeseStylePizza extends PizzaAbstract {

    public NYCheeseStylePizza(PizzaIngredientsFactory factory) {
        this.setIngredientsFactory(factory);
    }
}
