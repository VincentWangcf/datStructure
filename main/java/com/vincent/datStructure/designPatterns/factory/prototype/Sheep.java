package com.vincent.datStructure.designPatterns.factory.prototype;


import lombok.AllArgsConstructor;
import lombok.Data;
import sun.jvm.hotspot.memory.SharedHeap;

@Data
//@AllArgsConstructor
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    public Sheep friend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() {
        try {
            return (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println(e);
        }

        return null;
    }


}
