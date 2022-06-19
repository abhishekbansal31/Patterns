package com.pattern.factory.data.item.ingredients;

import com.pattern.factory.data.item.ingredients.products.cheese.Cheese;
import com.pattern.factory.data.item.ingredients.products.clams.Clams;
import com.pattern.factory.data.item.ingredients.products.dough.Dough;
import com.pattern.factory.data.item.ingredients.products.sauce.Sauce;

public interface PizzaIngredientsFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();
}
