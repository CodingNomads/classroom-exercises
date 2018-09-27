package javafundamentals.arrays;


import java.util.Arrays;

/**
 * Create an array of random numbers and print the index of the biggest number
 */

public class Ex4RandomNumbers {


    public static void main(String[] args) {
        double[] arrayLength = new double[50];
        Ex4RandomNumbers myObject = new Ex4RandomNumbers();
        System.out.println(myObject.findBiggest(myObject.generateArray(arrayLength)));
    }

    public double[] generateArray(double[] length){
        for(int x = 0; x<length.length; x++){
            double randNumber = Math.random();
            double d = randNumber * 100;
            length[x] = d;
        }
        return length;
    }

    public double findBiggest(double[] myArray){
        double answer = 0;
        double location = 0;
        for (int x=0; x<myArray.length; x++){
            if(myArray[x]>answer){
                answer = myArray[x];
                location = x;
            }

        }
        return location;

    }
}
