package com.pattern.factory.data.item.ingredients;

import com.pattern.factory.data.item.ingredients.products.cheese.Cheese;
import com.pattern.factory.data.item.ingredients.products.cheese.MozzarellaCheese;
import com.pattern.factory.data.item.ingredients.products.clams.Clams;
import com.pattern.factory.data.item.ingredients.products.clams.FrozenClams;
import com.pattern.factory.data.item.ingredients.products.dough.Dough;
import com.pattern.factory.data.item.ingredients.products.dough.ThickCrushDough;
import com.pattern.factory.data.item.ingredients.products.sauce.PlumTomatoSauce;
import com.pattern.factory.data.item.ingredients.products.sauce.Sauce;

public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory {

    @Override
    public Dough createDough() {
        return new ThickCrushDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
    
}
