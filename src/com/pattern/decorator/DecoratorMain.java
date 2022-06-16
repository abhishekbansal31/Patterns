package com.pattern.decorator;

import com.pattern.decorator.components.DarkRoast;
import com.pattern.decorator.decorators.Milk;
import com.pattern.decorator.decorators.Mocha;

public class DecoratorMain {

    public static void main(String[] args) {
     
        Beverage roastMilkMocha = new DarkRoast();
        Beverage milk = new Milk(roastMilkMocha);
        Beverage mocha = new Mocha(milk);

        System.out.println("Cost: "+mocha.cost());
        System.out.println("Description: "+mocha.getDescription());
        
    }
}
