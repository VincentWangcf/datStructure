package com.vincent.datStructure.designPatterns.factory.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "red");
        Sheep sheep1= (Sheep)sheep.clone();
        Sheep sheep2= (Sheep)sheep.clone();
        Sheep sheep3= (Sheep)sheep.clone();
        Sheep sheep4= (Sheep)sheep.clone();
        Sheep sheep5= (Sheep)sheep.clone();
        sheep2.friend = new Sheep("tom", 1, "white");
        sheep3.friend = new Sheep("tom", 1, "white");
        System.out.println(sheep ==sheep1);
        System.out.println("shhep1 =" +sheep2.friend.hashCode());
        System.out.println("shhep3 =" +sheep3.friend.hashCode());
        System.out.println(sheep2.friend.hashCode() ==sheep3.friend.hashCode() );
        System.out.println("shhep4 =" +sheep4);
        System.out.println("shhep5 =" +sheep5);
    }
}
