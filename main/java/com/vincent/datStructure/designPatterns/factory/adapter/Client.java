package com.vincent.datStructure.designPatterns.factory.adapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("main adapter is begin");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
