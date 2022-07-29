package com.vincent.datStructure.designPatterns.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        //两份巧克力 +一份牛奶的LongBlack
        Drink order = new LongBlack();

         order = new Milk(order);
         System.out.println(order.cost());
        System.out.println(order.getDesc());

        System.out.println("....");


    }
}
