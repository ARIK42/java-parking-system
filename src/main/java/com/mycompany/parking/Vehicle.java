package com.mycompany.parking;

public class Vehicle{
    private String colour;
    private String licensePlate;
    private double duration;
    private double hourlyRate;
    private double bill;

    public Vehicle(String LicensePlate, String Colour, double Duration, double HourlyRate){
        this.licensePlate = LicensePlate;
        this.colour = Colour;
        this.duration = Duration;
        this.hourlyRate = HourlyRate;}

    public String getColour(){
        return colour;
    }

    public double getDuration(){
        return duration;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void setColour(){
        this.colour = colour;
    }

    public void setDuration(){
        if (duration <= 0){   
            throw new IllegalArgumentException("Invalid Argument");}
        this.duration = duration;
    }

    public void setHourlyRate(){
        if (hourlyRate <= 0){    
            throw new IllegalArgumentException("Invalid Argument");}
        this.hourlyRate = hourlyRate;
    }

    public void setLicensePlate(){
        this.licensePlate = licensePlate;
    }

    public double bill(){
        return bill = this.hourlyRate*this.duration;
    }

    public double getBill(){
        return bill;
    }

    public void setBill(){
        this.bill = bill;
    }

    public String displaySlots(){
        return displayLicensePlate()+displayColour()+displayDuration()+displayHourlyRate();
    }

    public String displayBill(){
        return displayLicensePlate()+displayColour()+displayDuration()+displayHourlyRate()+displayTotalBill();
    }

    public String displayLicensePlate(){
        StringBuilder licensePlateBuilder = new StringBuilder();
        String licensePlateLine = "License Plate: "+this.licensePlate+"\n";
        licensePlateBuilder.append(licensePlateLine);
        return licensePlateBuilder.toString();
    }

    public String displayColour(){
        StringBuilder colourBuilder = new StringBuilder();
        String colourLine = "Colour: "+this.colour+"\n";
        colourBuilder.append(colourLine);
        return colourBuilder.toString();
    }

    public String displayDuration(){
        StringBuilder durationBuilder = new StringBuilder();
        String durationLine = "Duration: "+this.duration+" hour(s)"+"\n";
        durationBuilder.append(durationLine);
        return durationBuilder.toString();
    }

    public String displayHourlyRate(){
        StringBuilder HourlyRateBuilder = new StringBuilder();
        String HourlyRateLine = "Hourly Rate: $"+this.hourlyRate+" per hour"+"\n";
        HourlyRateBuilder.append(HourlyRateLine);
        return HourlyRateBuilder.toString();
    }

    public String displayTotalBill(){
        StringBuilder TotalBillBuilder = new StringBuilder();
        String TotalBillLine = "Total bill: $"+this.bill()+"\n";
        TotalBillBuilder.append(TotalBillLine);
        return TotalBillLine.toString();
    }
}