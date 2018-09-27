package javafundamentals.arrays;

/**
 * Create an array containing the age of 5 people.
 * Print the average age, the sum of them, the youngest age and the oldest age.
 */

public class Ex3AgeStatistics {
    public static void main(String[] args) {

        int[] ageArray = {24, 32, 55, 37, 21};

        int ageSum = 0;

        int youngestAge = ageArray[0];
        int oldestAge = ageArray[0];

        for (int i = 0; i < ageArray.length; i++) {
            ageSum += ageArray[i];

            if (ageArray[i] < youngestAge) {
                youngestAge = ageArray[i];
            }
            if (ageArray[i] > oldestAge) {
                oldestAge = ageArray[i];
            }
        }

        int averageAge = ageSum / ageArray.length;

        System.out.println("Age average = " + averageAge);
        System.out.println("Age sum = " + ageSum);
        System.out.println("Youngest = " + youngestAge);
        System.out.println("Oldest = " + oldestAge);
    }
}