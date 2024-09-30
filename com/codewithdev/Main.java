package com.codewithdev;

import com.codewithdev.generics.GenericList;
import com.codewithdev.generics.User;

public class Main {
    public static void main(String[] args) {
        var user1 = new User(10);
        var user2 = new User(20);

        if (user1.compareTo(user2) < 0) {
            System.out.println("User  < users2");
        } else if (user1.compareTo(user2) == 0) {
            System.out.println("User1 equals user2");
        } else {
            System.out.println("User1 > user2");
        }
    }
}