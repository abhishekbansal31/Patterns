package com.pattern.decorator.components;

import com.pattern.decorator.Beverage;

public class HouseBlend implements Beverage {

    @Override
    public float cost() {
        return 0.9f;
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }
    
}
