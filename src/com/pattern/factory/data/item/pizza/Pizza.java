package com.pattern.factory.data.item.pizza;

import com.pattern.factory.data.item.ingredients.IngredientsFactory;

public interface Pizza {
    void prepare(IngredientsFactory factory);
    void bake();
    void cut();
    void box();
}
