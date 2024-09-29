package com.codewithdev;

import com.codewithdev.generics.List;
import com.codewithdev.generics.User;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(Integer.valueOf(1));
        list.add("1");
        list.add(new User());

        int number = (int) list.get(2);
    }
}