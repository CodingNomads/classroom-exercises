package javafundamentals.arrays;


/**
 * Create an array of random numbers and print the index of the biggest number
 * */
public class Ex4RandomNumbers {
    public static void main(String[] args) {
        int[] randomArray = new int[10];

        System.out.println("Of the following numbers:");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)(Math.random() * 100 + 1);

            System.out.println("Index " + i + ": " + randomArray[i]);
        }

        int biggestNumberIndex = 0;

        for (int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] > randomArray[biggestNumberIndex]) {
                biggestNumberIndex = i;
            }
        }

        System.out.println("The largest is at index " + biggestNumberIndex);
    }
}
