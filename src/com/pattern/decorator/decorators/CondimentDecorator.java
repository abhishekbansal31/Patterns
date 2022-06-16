package com.pattern.decorator.decorators;

import com.pattern.decorator.Beverage;

public abstract class CondimentDecorator implements Beverage {
    private Beverage beverage;

    public abstract String getDescription();

    /**
     * @return Beverage return the beverage
     */
    protected Beverage getBeverage() {
        return beverage;
    }

    /**
     * @param beverage the beverage to set
     */
    protected void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

}
