package com.jee.revision.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DIARY", 1);
    }
}
public class Practice1 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");

        System.out.println(fruits);

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        List<String> stringList = new ArrayList<>();

        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");

        stringList = new LinkedList<>(stringList);

        System.out.println(stringList);

        System.out.println("********************************");




//        ArrayList alist = new ArrayList();
//        List list = new ArrayList();
////        Collection clist = new ArrayList();
//        alist.add("apple");
//        alist.add(123);
//        alist.add(45.67);
//        System.out.println("alist : " + alist);


//        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");

//        System.out.println("fruits : " + fruits[1]);

//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println(fruits.get(i));
//        }
    }
}
