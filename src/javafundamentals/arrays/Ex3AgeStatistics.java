package javafundamentals.arrays;

/**
 * Create an array containing the age of 5 people.
 * Print the average age, the sum of them, the youngest age and the oldest age.
 */

public class Ex3AgeStatistics {
    public static void main(String[] args) {

        int[] ageArray = new int[5];
        ageArray[0] = 7;
        ageArray[1] = 12;
        ageArray[2] = 20;
        ageArray[3] = 25;
        ageArray[4] = 3;

        int avgAge = 0;
        int sum = 0;
        int youngest = 1000;
        int oldest = -1;

        for (int i = 0; i < ageArray.length; i++) {
            sum += ageArray[i];
            if (ageArray[i] < youngest) {
                youngest = ageArray[i];
            }
            if (ageArray[i] > oldest) {
                oldest = ageArray[i];
            }
        }

        avgAge = sum / ageArray.length;
        System.out.println(sum);
        System.out.println(avgAge);
        System.out.println(youngest);
        System.out.println(oldest);


    }


}