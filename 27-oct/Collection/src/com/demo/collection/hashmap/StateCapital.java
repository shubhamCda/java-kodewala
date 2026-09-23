package com.demo.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StateCapital {

    static void main(String[] args) {
        Map<String, String> stateCapital = new HashMap<>();

        stateCapital.put("Maharashtra", "Mumbai");
        stateCapital.put("TamilNadu", "Chennai");
        stateCapital.put("Karnataka", "Bengaluru");
        stateCapital.put("MP", "Bhopal");

        System.out.println(stateCapital);

        for (Map.Entry<String,String> entry : stateCapital.entrySet()){
            System.out.println(entry.getKey().hashCode() +" : "+ entry.getValue());
        }
    }
}
