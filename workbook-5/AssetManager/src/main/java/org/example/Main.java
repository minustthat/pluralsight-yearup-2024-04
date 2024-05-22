package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Asset> assets = new ArrayList<>(Arrays.asList(
             new House("Fire Mansion", "8/5/1998", 1000000, "85 North Lane", 1, 30000, 5),
             new House("Crib", "2/22/22", 2000000, "65 Shadow way", 5, 19000, 6),
             new Vehicle("Plush thang", "2/02/2022", 32000, "Maybach Benz", 2021, 30),
            new Vehicle("Snackmobile", "1/01/1011", 5000, "Silver Surfer", 1000, 30)

    ));

    public static void main(String[] args) {
System.out.println(assets.get(0).getValue());
System.out.println(assets.get(2).getValue());
    }
}