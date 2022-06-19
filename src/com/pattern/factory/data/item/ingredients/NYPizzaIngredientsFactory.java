package com.pattern.factory.data.item.ingredients;

import com.pattern.factory.data.item.ingredients.products.cheese.Cheese;
import com.pattern.factory.data.item.ingredients.products.cheese.ReggianoCheese;
import com.pattern.factory.data.item.ingredients.products.clams.Clams;
import com.pattern.factory.data.item.ingredients.products.clams.FreshClams;
import com.pattern.factory.data.item.ingredients.products.dough.Dough;
import com.pattern.factory.data.item.ingredients.products.dough.ThinCrushDough;
import com.pattern.factory.data.item.ingredients.products.sauce.MarinaraSauce;
import com.pattern.factory.data.item.ingredients.products.sauce.Sauce;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory {

    @Override
    public Dough createDough() {
        return new ThinCrushDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
    
}
