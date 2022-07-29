package com.vincent.datStructure.designPatterns.bridge;

public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new Xiaomi());
        foldedPhone.call();
    }
}
