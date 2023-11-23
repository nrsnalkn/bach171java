package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        //hashmap arkasindaki calisan makanizma nasil

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");

        capitals.get("USA");

        capitals.put("Italy", "Roma");
        capitals.put("Turkiye", "Ankara");
        capitals.get("Turkiye");
        capitals.put("Italy", "Floransa");

        System.out.println(capitals.hashCode());

    }
}
