package com.pattern.factory.data.item.pizza;

import com.pattern.factory.data.item.ingredients.PizzaIngredientsFactory;
import com.pattern.factory.data.item.ingredients.products.cheese.Cheese;
import com.pattern.factory.data.item.ingredients.products.clams.Clams;
import com.pattern.factory.data.item.ingredients.products.dough.Dough;
import com.pattern.factory.data.item.ingredients.products.sauce.Sauce;

public abstract class PizzaAbstract implements Pizza {
    private PizzaIngredientsFactory ingredientsFactory= null;
    
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private Clams clams;

    protected PizzaIngredientsFactory getIngredientsFactory() {
        return this.ingredientsFactory;
    }
    
    @Override
    public void setIngredientsFactory(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory= ingredientsFactory;
    }

    public Dough getDough() {
        return dough;
    }

    protected void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    protected void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Cheese getCheese() {
        return cheese;
    }

    protected void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Clams getClams() {
        return clams;
    }

    protected void setClams(Clams clams) {
        this.clams = clams;
    }

    @Override
    public void prepare() {
        this.setDough(this.getIngredientsFactory().createDough());
        this.setSauce(this.getIngredientsFactory().createSauce());
        this.setCheese(this.getIngredientsFactory().createCheese());
        this.setClams(this.getIngredientsFactory().createClams());
    }

    @Override
    public void bake() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cut() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void box() {
        // TODO Auto-generated method stub
        
    }

}
