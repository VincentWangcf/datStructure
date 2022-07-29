package com.vincent.datStructure.designPatterns.decorator;

public class Decorator extends Drink {

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    private Drink drink;
    @Override

    //getPricce 获取自己调味料的价格   +咖啡原料的价格
    public double cost() {
        return super.getPrice() +drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() +" "+ super.getPrice() +" && " +drink.getDesc();
    }
}
