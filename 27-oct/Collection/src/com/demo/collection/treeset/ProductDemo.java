package com.demo.collection.treeset;

import java.util.HashMap;
import java.util.TreeSet;

public class ProductDemo {
    static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("laptop");
        ts.add("phones");
        ts.add("headphones");
        ts.add("laptop");
        //ts.add(null); //throws Exception in thread "main" java.lang.NullPointerException

//        System.out.println(ts);

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "shubh");
        hm.put(2, "ashri");
        hm.put(3, "Ayaa");
        hm.put(4, "Avi");

        System.out.println(hm);


    }
}
