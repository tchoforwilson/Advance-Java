package com.codewithdev;

import com.codewithdev.executors.CompletableFuturesDemo;
import com.codewithdev.executors.MailService;

public class Main {
    public static void main(String[] args) {
        var service = new MailService();
        service.sendAsync();
        System.out.println("Hello World!");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}