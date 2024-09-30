package com.codewithdev;

import com.codewithdev.generics.GenericList;
import com.codewithdev.generics.Instructor;
import com.codewithdev.generics.User;
import com.codewithdev.generics.Utils;

public class Main {
    public static void main(String[] args) {
        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
        Utils.printUsers(users);
    }
}