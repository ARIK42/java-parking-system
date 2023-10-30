package com.mycompany.parking;
import java.util.Vector;

public class ParkingLot{
    private static final int TotalSlots = 50;
    private Vector<Vehicle> NextSlot = new Vector<Vehicle>();
    
    public ParkingLot(){
        this.NextSlot = new Vector<Vehicle>(TotalSlots);
    }

    public static int getTotalSlots(){
        return TotalSlots;
    }

    public int EmptySlots(){
        return this.TotalSlots-this.NextSlot.size();
    }

    public int OccupiedSlots(){
        return this.NextSlot.size();
    }

    public String addVehicle(Vehicle vehicle){
        StringBuilder addingBuilder = new StringBuilder();
        if (this.EmptySlots()>0){
            this.NextSlot.addElement(vehicle);
            addingBuilder.append(vehicle.displaySlots());
        }
        return addingBuilder.toString();
    }

    public String displayParkedVehicle(){
        StringBuilder parkedBuilder = new StringBuilder();
        for (Vehicle vehicle : this.NextSlot) {
            parkedBuilder.append(vehicle.displaySlots()+"\n");
        }
        return parkedBuilder.toString();
    }

    public String displayBillParked(){
        StringBuilder BillparkedBuilder = new StringBuilder();
        for (Vehicle vehicle : this.NextSlot){
            BillparkedBuilder.append(vehicle.displayBill()+"\n");
        }
        return BillparkedBuilder.toString();
    }
}
