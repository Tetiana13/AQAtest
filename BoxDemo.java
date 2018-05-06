package com.company;

/**
 * Created by Student on 06.05.2018.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20 , 30);
        Box mybox2 = new Box(3, 6 ,9);

        double vol;
      /*  mybox1.widgh = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.widgh = 3;
        mybox2.height = 6;
        mybox2.depth = 9;*/
/*
        vol = mybox.depth*mybox.height*mybox.widgh;
        System.out.println("Объем равен: " + vol);
        */
   /*     mybox1.volume();
        mybox2.volume();
        */

          vol = mybox1.volume();
          System.out.println("Volume is: " + vol);
          vol = mybox2.volume();
          System.out.println("Volume is: " + vol);



    }
}
