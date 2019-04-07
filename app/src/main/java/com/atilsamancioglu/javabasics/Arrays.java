package com.atilsamancioglu.javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args){

        //Array

        String[] myStringArray = new String[4];

        myStringArray[0] = "James";
        myStringArray[1] = "Lars";
        myStringArray[2] = "Kirk";
        myStringArray[3] = "Rob";

        System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[4];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;
        myIntegerArray[3] = 80;

        System.out.println(myIntegerArray[1]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[2]);


        //Lists

        ArrayList<String> myMusicians = new ArrayList<String>();

        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");
        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        System.out.println(myMusicians.size());

        //Set

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("James");
        mySet.add("James");

        System.out.println(mySet.size());

        //HashMap

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("name","James");
        myHashMap.put("instrument","Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));


        HashMap<String, Integer> mySecondMap = new HashMap<>();

        mySecondMap.put("run",100);
        mySecondMap.put("basketball",200);

        System.out.println(mySecondMap.get("run"));

    }

}
