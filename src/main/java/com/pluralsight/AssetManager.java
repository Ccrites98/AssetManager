package com.pluralsight;
import java.util.ArrayList;
public class AssetManager {
        public static void main(String[] args) {
            //make list
            ArrayList<Asset> assets = new ArrayList<>();
            assets.add(new House("My House", "2005-01-30", 200000.0,
                    "1952 Jack Parsons Way", 1, 2000, 5000));
            assets.add(new House("Vacation Home", "2017-05-15", 300000.0,
                    "1950 Hubbard Way", 2, 2500, 9000));
            assets.add(new Vehicle("Tom Cruise's Truck", "2022-06-09", 35000.0,
                    "Chevy Silverado", 2022, 17000));
            assets.add(new Vehicle("My Car", "2016-04-20", 25000.0,
                    "Toyota Solara", 1999, 13000));
            assets.add(new Cash("Money I'm Hiding from the IRS", "2023-11-09", 2.00));
            //assets 'n stuff
            for (Asset asset : assets) {
                System.out.println("Description: " + asset.getDescription());
                System.out.println("Date Acquired: " + asset.getDateAcquired());
                System.out.println("Original Cost: $" + asset.getOriginalCost());
                System.out.println("Value: $" + asset.getValue());
                if (asset instanceof House) {
                    House house = (House) asset;
                    System.out.println("Address: " + house.getAddress());
                } else if (asset instanceof Vehicle) {
                    Vehicle vehicle = (Vehicle) asset;
                    System.out.println("Year and Make/Model: " + vehicle.getYear() + " " + vehicle.getMakeModel());
                } else if (asset instanceof Cash) {
                    System.out.println("Type: Cash");
                }
                System.out.println("------------------------");
            }}}