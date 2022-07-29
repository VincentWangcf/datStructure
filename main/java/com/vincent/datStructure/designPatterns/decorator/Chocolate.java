package com.vincent.datStructure.designPatterns.decorator;


/**
 * 巧克力调味料
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDesc("添加巧克力");
        setPrice(3);
    }
}
