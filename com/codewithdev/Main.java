package com.codewithdev;

import com.codewithdev.generics.GenericList;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");

        for (var item : list.items)
            System.out.println(item);
    }
}