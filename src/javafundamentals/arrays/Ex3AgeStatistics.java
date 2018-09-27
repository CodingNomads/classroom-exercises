package javafundamentals.arrays;

/**
 * Create an array containing the age of 5 people.
 * Print the average age, the sum of them, the youngest age and the oldest age.
 */

public class Ex3AgeStatistics {
    public static void main(String[] args) {
        int[] ages = {20, 30, 40, 50, 60};
        System.out.println(sum(ages));
        System.out.println(average(sum(ages), ages));
        System.out.println(youngest(ages));
        System.out.println(oldest(ages));

    }
    //sum of ages method
    public static double sum(int[] myNumber){
        double answer = 0;
        for(int x = 0; x<5; x++){
            answer = answer + myNumber[x];
        }return answer;
    }
    //average method
    public static double average(double answer, int[] myNumber){
        double averageAnswer = answer/myNumber.length;
        return averageAnswer;
    }

    //youngest age
    public static int youngest(int[] myNumber){
        int youngest = 200;
        for (int x = 0; x<5; x++){
            if (myNumber[x]<youngest){
                youngest = myNumber[x];
            }

        }
        return youngest;
    }
    //oldest age
    public static int oldest(int[] myNumber){
        int oldest = 0;
        for (int x = 0; x<5; x++){
            if (myNumber[x]>oldest){
                oldest = myNumber[x];
            }

        }
        return oldest;
    }


}
