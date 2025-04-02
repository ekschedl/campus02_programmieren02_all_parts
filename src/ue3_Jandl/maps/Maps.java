package ue3_Jandl.maps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Graz", 306068);
        map.put("Vienna", 2005500);
        map.put("Linz", 212000);
        map.put("London", 8866180);
        map.put("Beijing", 22000000);

        // Ausgeben in der Konsole über key
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " has a population of " + value);
        }
        System.out.println("-------------------------");
        // Ausgeben in der Konsole über value
        for (Integer value : map.values()) {
                System.out.println("Population: " + value);
        }
        System.out.println("-------------------------");

        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " has a population of " + entry.getValue());
        }

        map.remove("London");

        System.out.println("-------------------------");

        //find all that fullfill a condition >1 000 000
        System.out.println("These cities have a population of over 1 000 000:");

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            if (value >= 1_000_000) {
                System.out.println(key);
            }
        }


        //change value in map
        map.replace("Graz", 400000);

        System.out.println("Updated population of Graz: " + map.get("Graz"));    }


}