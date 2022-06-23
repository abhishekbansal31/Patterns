package com.pattern.factory.data.item.pizza;

import com.pattern.factory.data.item.ingredients.PizzaIngredientsFactory;

public class ChicagoVeggieStylePizza extends PizzaAbstract {

    public ChicagoVeggieStylePizza(PizzaIngredientsFactory factory) throws NullPointerException  {
        this.setIngredientsFactory(factory);
    }
}
