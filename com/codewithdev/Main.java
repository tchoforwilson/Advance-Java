package com.codewithdev;

import com.codewithdev.generics.GenericList;
import com.codewithdev.generics.User;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<User>();
        list.add(new User());
        User user = list.get(0);
    }
}