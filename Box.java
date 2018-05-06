package com.company;

/**
 * Created by Student on 06.05.2018.
 */
// This programm includes a method inside the box
public class Box {
    double widgh;
    double height;
    double depth;

    // This is the constructor  for Box
    Box(double w, double h, double d) {

    widgh =w;
    height =h;
    depth =d;

}
    // displayed volume of a box
    double volume(){

        return widgh*height*depth;

    }
}
