package com.pluralsight;

public class House extends Asset {
    public String address;
    public int condition;
    public int squareFoot;
    public int lotSize;

    public House() {
    }

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getCondition(){
        double value = this.getValue();
        if (value >= 180) {
            return 1;
        }else if (value < 179.99 && value >= 130){
            return 2;
        } else if (value < 129.99 && value >= 90){
            return 3;
        }else{
            return 4;
        }
    }

    @Override
    public double getValue() {
        double value = this.originalCost / this.squareFoot; // original cost divided by squareFoot is value
        value = value + (this.lotSize * .25); //
        return value;
    }

    //house's value is determined as
    // $180.00 per square foot (excellent)
    // $130.00 per square foot (good)
    // $90.00 per square foot (fair)
    // $80.00 per square foot (poor)
    // PLUS 25 cents per square foot of lot size
}
