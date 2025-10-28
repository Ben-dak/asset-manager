package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<Asset>();

        myAssets.add(new House());
        myAssets.add(new Vehicle());
    }
}
