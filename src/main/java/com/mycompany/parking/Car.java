package com.mycompany.parking;

public class Car extends Vehicle{
    public Car(String LicensePlate,String Colour,double Duration,double HourlyRate){
        super(LicensePlate,Colour,Duration,HourlyRate);
    }

    public void displayCar(){
        super.displaySlots();
    }
}
