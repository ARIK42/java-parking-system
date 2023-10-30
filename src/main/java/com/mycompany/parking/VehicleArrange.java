package com.mycompany.parking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;

public class VehicleArrange extends JFrame{
    public VehicleArrange()
    {
        Car Car1 = new Car("CK7599","Red",1.00,4.00);
        Car Car2 = new Car("IR1190","Green",0.5,3.00);
        Car Car3 = new Car("YI3677","Blue",3.00,4.00);

        ParkingLot Slots = new ParkingLot();
        Slots.addVehicle(Car1);
        Slots.addVehicle(Car2);
        Slots.addVehicle(Car3);
       
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame programFrame = new JFrame("Parking System 1.0 (alpha)");

        JButton Status = new JButton("Empty/Occupied Slots");
        Status.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                StringBuilder availBuilder = new StringBuilder();
                availBuilder.append("Occupied Slot(s): "+Slots.OccupiedSlots()
                +"\nEmpty Slot(s): "+Slots.EmptySlots());
                JOptionPane.showMessageDialog(null, availBuilder.toString());
            }
        });

        JButton Bill = new JButton("Calculate Bill");
        Bill.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton confirmBill = new JButton();
                StringBuilder BillDisplay = new StringBuilder();
                BillDisplay.append(Slots.displayBillParked());
                JOptionPane.showMessageDialog(null,BillDisplay.toString());
            }
        });

        JButton Save = new JButton("Save");
        Save.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton confirmPrint = new JButton();
                try{
                    PrintWriter File = new PrintWriter("AsmData.txt");
                    StringBuilder printBuilder = new StringBuilder();
                    printBuilder.append(Slots.displayBillParked());
                    File.printf(printBuilder.toString());
                    File.close();
                    JOptionPane.showMessageDialog(null,"Records saved in AsmData.txt");
                }

                catch (IOException ioException){
                    ioException.printStackTrace();
                }  
            }
        });

        programFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        panel.add(Status);
        panel.add(Bill);
        panel.add(Save);
        programFrame.add(panel);
        programFrame.setSize(400,300);
        programFrame.setLocationRelativeTo(null);
        programFrame.setVisible(true);
    }

    public static void main(String[] args){
        VehicleArrange programWindow = new VehicleArrange();
    }
}
