package com.codewithdev.collections;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "a", "b", "c", "a");
        list.set(0, "a+");
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));
        System.out.println(list.subList(0, 2));
    }
}
