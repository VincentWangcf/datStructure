package com.vincent.datStructure.designPatterns.factory.absfacotry.pizza;

public class BJChineesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("北京pizza 准备中》》》》");
    }
}
