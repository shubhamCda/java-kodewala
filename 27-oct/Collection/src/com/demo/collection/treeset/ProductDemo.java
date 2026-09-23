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

//        System.out.println(hm);

        TreeSet<Integer> tsI = new TreeSet<>();

        tsI.add(287);
        tsI.add(28);
        tsI.add(7);
        tsI.add(-2);

        ts.clear();
        tsI.clear();
        System.out.println(tsI);

    }
}
