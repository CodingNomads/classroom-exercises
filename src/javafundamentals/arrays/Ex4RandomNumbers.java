package javafundamentals.arrays;


import java.util.Random;

/**
 * Create an array of random numbers and print the index of the biggest number
 */

public class Ex4RandomNumbers {


    public static void main(String[] args) {
        Random[] arrayLength = new Random[50];
        System.out.println(generateArray(arrayLength));

    }

    public static Random[] generateArray(Random[] length){
        for(int x = 0; x<length.length; x++){
            Random randomNum = new Random();
            length[x] = randomNum;
            System.out.println(length);
        }
        return length;
    }

    public static int findBiggest(int[] myArray){
        int answer = 0;
        int location = 0;
        for (int x=0; x<myArray.length; x++){
            if(myArray[x]>answer){
                answer = myArray[x];
                location = x;
            }

        }
        return location;

    }
}
