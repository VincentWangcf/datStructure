package com.vincent.datStructure.designPatterns.factory.adapter;

public class VoltageAdapter implements Voltage5V {
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    private Voltage220V voltage220V;
    @Override
    public int output5V() {
        int dst =0;
        if (null!= voltage220V){
            int src = voltage220V.output220v();
            System.out.println("使用对象适配器～");
            dst= src /44;
            System.out.println("适配器完成，输出的电压为 ="+dst);

        }
        return dst;
    }
}
