package com.vincent.datStructure.designPatterns.decorator;

public abstract class Drink {
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String desc;
    private double price =0;


    //  计算费用的抽象方法，子类去实现
    public abstract double cost();
}

