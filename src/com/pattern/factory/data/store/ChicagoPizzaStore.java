package com.pattern.factory.data.store;

import com.pattern.factory.data.item.ingredients.IngredientsFactory;
import com.pattern.factory.data.item.pizza.ChicagoCheeseStylePizza;
import com.pattern.factory.data.item.pizza.ChicagoVeggieStylePizza;
import com.pattern.factory.data.item.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore(IngredientsFactory factory) {
        this.setIngredientsFactory(factory);
    }

    @Override
    protected Pizza createPizza(String type) {  // Factory Method
        Pizza pizza = null;
        if(type.equals("Cheese")) {
            pizza = new ChicagoCheeseStylePizza();
        } else if(type.equals("Veggie")) {
            pizza = new ChicagoVeggieStylePizza();
        }
        return pizza;
    }
    
}
