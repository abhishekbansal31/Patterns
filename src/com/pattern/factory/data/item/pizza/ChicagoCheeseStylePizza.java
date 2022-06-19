package com.pattern.factory.data.item.pizza;

import com.pattern.factory.data.item.ingredients.PizzaIngredientsFactory;

public class ChicagoCheeseStylePizza extends PizzaAbstract {

    public ChicagoCheeseStylePizza(PizzaIngredientsFactory factory) {
        this.setIngredientsFactory(factory);
    }
}
