package com.pattern.decorator.decorators;

import com.pattern.decorator.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.setBeverage(beverage);
    }

    @Override
    public float cost() {
        return 1.0f + this.getBeverage().cost();
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + ", Milk";
    }
    
}
