package com.pattern.factory.data.store;

import com.pattern.factory.data.item.ingredients.PizzaIngredientsFactory;
import com.pattern.factory.data.item.pizza.ChicagoCheeseStylePizza;
import com.pattern.factory.data.item.pizza.ChicagoVeggieStylePizza;
import com.pattern.factory.data.item.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore(PizzaIngredientsFactory factory) {
        this.setIngredientsFactory(factory);
    }

    @Override
    protected Pizza createPizza(String type) {  // Factory Method
        Pizza pizza = null;
        if(type.equals("Cheese")) {
            pizza = new ChicagoCheeseStylePizza(this.getIngredientsFactory());
        } else if(type.equals("Veggie")) {
            pizza = new ChicagoVeggieStylePizza(this.getIngredientsFactory());
        }
        return pizza;
    }
    
}
