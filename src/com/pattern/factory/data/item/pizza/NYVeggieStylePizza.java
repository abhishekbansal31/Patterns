package com.pattern.factory.data.item.pizza;

import com.pattern.factory.data.item.ingredients.PizzaIngredientsFactory;

public class NYVeggieStylePizza extends PizzaAbstract {

    public NYVeggieStylePizza(PizzaIngredientsFactory factory) {
        this.setIngredientsFactory(factory);
    }
}
