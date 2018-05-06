package com.company;

/**
 * Created by Student on 06.05.2018.
 */
public class Main {
    public static void main(String[] args) {
        Girl ira = new Girl("Ira", 23);
        System.out.println(ira);
        System.out.println(ira.presentGift(new Box(12, 12, 12)));
        System.out.println(ira.goToRestaurant("Mac"));
    }
}
