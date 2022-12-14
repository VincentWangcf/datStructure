package com.vincent.datStructure.designPatterns.simulation;

public class OozinozRocket extends PhysicalRocket implements RocketSim {
    private double time;

    public OozinozRocket(
            double burnArea,
            double burnRate,
            double fuelMass,
            double totalMass) {
        super(burnArea, burnRate, fuelMass, totalMass);
    }

    @Override
    public double getMass() {
        return getMass(time);
    }



    @Override
    public void setSimTime() {

    }


    public double getThrust() {
        return getThrust(time);
    }
    public void setSimTime(double time) {
        this.time = time;
    }
}