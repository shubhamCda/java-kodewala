package com.demo.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class ProductDemo {
    public static void main(String[] args) {
        HashSet<String> products = new HashSet<>();

        products.add("mobiles");
        products.add(null);
        products.add("tablet");
        products.add("headphones");
        products.add("mirror");
        products.add("bag");
        products.add("headphones");
        products.add("goggles");
        products.add("comb");
        products.add(null);

        System.out.println(products);

        Iterator<String> itr = products.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
