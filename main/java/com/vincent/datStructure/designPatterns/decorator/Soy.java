package com.vincent.datStructure.designPatterns.decorator;

public class Soy extends Decorator {
    public Soy(Drink drink) {

        super(drink);
        setDesc("豆浆 ");
        setPrice(1.5);
    }
}
