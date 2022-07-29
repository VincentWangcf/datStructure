package com.vincent.datStructure.designPatterns.decorator;

public class Coffee extends Drink {
    @Override
    public double cost() {
        return super.getPrice();
    }
}
