package com.pattern.decorator.decorators;

import com.pattern.decorator.Beverage;

public class Mocha extends CondimentDecorator {
    
    public Mocha(Beverage beverage) {
        this.setBeverage(beverage);
    }

    @Override
    public float cost() {
        return 0.5f + this.getBeverage().cost();
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + ", Mocha";
    }
}
