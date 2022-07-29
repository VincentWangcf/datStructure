package com.vincent.datStructure.designPatterns.bridge;

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo mi phone open");
    }

    @Override
    public void close() {
        System.out.println("Vivo phone close");

    }

    @Override
    public void call() {
        System.out.println("Vivo phone call");

    }
}
