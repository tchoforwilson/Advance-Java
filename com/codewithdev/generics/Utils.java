package com.codewithdev.generics;

import com.codewithdev.generics.User;
import com.codewithdev.generics.GenericList;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) < 0 ? second : first;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + ": " + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    // class CAP#1 extends User {}
    // class Instructor extends User {}
    public static void printUsers(GenericList<? super User> users) {
        GenericList<Object> temp = new GenericList<>();

        Object x = users.get(0);
    }
}
