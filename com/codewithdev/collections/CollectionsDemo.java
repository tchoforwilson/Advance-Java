package com.codewithdev.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<String>();
        Collections.addAll(collection, "a", "b", "c");
        Object[] objectArray = collection.toArray();
        String[] strinArray = collection.toArray(new String[0]);

    }
}
