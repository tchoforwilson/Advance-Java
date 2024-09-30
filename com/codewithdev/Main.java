package com.codewithdev;

import com.codewithdev.generics.GenericList;
import com.codewithdev.generics.User;
import com.codewithdev.generics.Utils;

public class Main {
    public static void main(String[] args) {
        var max = Utils.max(new User(10), new User(20));
        System.out.println(max);
    }
}