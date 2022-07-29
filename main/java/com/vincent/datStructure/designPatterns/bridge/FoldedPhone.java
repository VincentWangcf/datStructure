package com.vincent.datStructure.designPatterns.bridge;

public class FoldedPhone extends Phone {


    public FoldedPhone(Brand brand) {
        super(brand);
    }


    public void open(){
        super.open();
        System.out.println("this is foldedPhone open...");
    }


    public void close(){
        super.close();
        System.out.println("this is foldedPhone close...");
    }

    public void call(){
        super.call();
        System.out.println("this is foldedPhone call...");
    }
}
