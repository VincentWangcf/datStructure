package com.vincent.datStructure.designPatterns.bridge;

public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("xiao mi phone open");
    }

    @Override
    public void close() {
        System.out.println("xiaomi phone close");

    }

    @Override
    public void call() {
        System.out.println("xiaomi phone call");

    }
}
