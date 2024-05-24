package com.refactorizando.statepattern.example;




public class Main {
    public static void main(String[] args) {
        User user = new User();

        System.out.println(user.activate()); 
        System.out.println(user.buy()); 
        System.out.println(user.lock()); 
        System.out.println(user.disable()); 
    }
}
