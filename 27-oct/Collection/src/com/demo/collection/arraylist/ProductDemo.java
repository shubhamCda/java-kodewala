package com.demo.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductDemo {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Laptop");
        products.add("Phones");
        products.add("Phones");
        products.add("AirPods");
        products.add("AirPods");

        Iterator<String> itr = products.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("Electronic Products: "+ products);
        System.out.println("Electronic Products: "+ products.size());
        System.out.println("First Product: "+ products.get(0));
        System.out.println("Reomove Product: "+ products.remove(2));
        System.out.println("Reomove Product: "+ products.remove("AirPods"));
        System.out.println("Electronic Products: "+ products);
    }
}
