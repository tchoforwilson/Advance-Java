package com.codewithdev.collections;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer other1, Customer other2) {
        return other1.getEmail().compareTo(other2.getEmail());
    }

}
