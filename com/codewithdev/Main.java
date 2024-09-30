package com.codewithdev;

import com.codewithdev.generics.GenericList;
import com.codewithdev.generics.User;

public class Main {
    public static void main(String[] args) {
        // int -> Integer
        // float -> Float
        // boolean -> Boolean
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // Boxing
        int number = numbers.get(0); // Unboxing
    }
}