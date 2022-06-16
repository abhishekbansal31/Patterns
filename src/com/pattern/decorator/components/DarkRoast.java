package com.pattern.decorator.components;

import com.pattern.decorator.Beverage;

public class DarkRoast implements Beverage {

    @Override
    public float cost() {
        return 1.2f;
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }
    
}
