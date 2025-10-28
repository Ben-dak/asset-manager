package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>(); // Asset is the parent

        House house1 = new House();
        house1.setDescription("huh this my house?");
        house1.setSquareFoot(400);
        house1.setLotSize(1);
        house1.setOriginalCost(9000);
        System.out.println(house1.getValue());
        System.out.println(house1.getCondition());



//        House myHouse = new House();
//
//        myHouse.setDescription("My house");
//
//        House vacaHouse = new House();
//        vacaHouse.setDescription("Vacation House");
//
//        Vehicle myCar = new Vehicle();
//        Vehicle myTruck = new Vehicle();
//
//        myAssets.add(new House());
//        myAssets.add(new Vehicle());

    }
}
