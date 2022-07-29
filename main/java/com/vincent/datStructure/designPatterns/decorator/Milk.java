package com.vincent.datStructure.designPatterns.decorator;

public class Milk extends Decorator {
    public Milk(Drink drink) {

        super(drink);
        setDesc("牛奶 ");
        setPrice(2);
    }
}
