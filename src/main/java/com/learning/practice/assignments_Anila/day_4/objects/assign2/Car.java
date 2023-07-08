package com.learning.practice.assignments_Anila.day_4.objects.assign2;

public class Car extends RoadVehicle{
    @Override
    public String vehicleType() {
        return "car vehicle type";
    }

    @Override
    public String engine() {
        return "car engine";
    }

    @Override
    public String steering() {
        return "car steering";
    }

    public String wheelType(){
        return "car wheel type";
    }
}
