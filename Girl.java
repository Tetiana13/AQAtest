package com.company;

/**
 * Created by Student on 06.05.2018.
 */
public class Girl {
    private final String name;
    private final int age;

    public Girl (String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean presentGift(Box gift) {
    if ( gift.volume()>500 )
        return true;
        return  false;

    }

    public String goToRestaurant(String rest) {

        if (!"Mac".equals(rest)){
            return "Yes";
        }
        return "No";
    }
}

