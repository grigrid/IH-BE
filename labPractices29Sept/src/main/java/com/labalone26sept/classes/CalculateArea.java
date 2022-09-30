package com.labalone26sept.classes;

import java.awt.*;

public class CalculateArea {


    final double PI = Math.PI;
    // circle = PI , radio
    // Rectangle =  base,  altura
    // Square =  base2
    public static double calculateArea(ShapeType shape, double... num){

       /* if(ShapeType.CIRCLE == shape && num.length > 1){
            throw new IllegalArgumentException("Product is greater than Integer.MAX_Value");
        }  else {
            return Math.PI * num[0] * num[0] ;
        }*/


        /*if (ShapeType.SQUARE == shape &&  num.length == 1){
            return Math.pow(num[0], 2);
        } else {
            throw new IllegalArgumentException("Product is greater than Integer.MAX_Value");
        }*/

        if(ShapeType.RECTANGLE == shape && num.length == 2){
            return num[0] * num[1]/2;
        } else {
            throw new IllegalArgumentException("Product is greater than Integer.MAX_Value");
        }


    }
}
