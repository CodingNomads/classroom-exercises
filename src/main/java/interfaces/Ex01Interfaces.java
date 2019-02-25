package interfaces;

import java.util.Random;


/**
 * Create a couple of classes that have some behaviour and some specific behaviour in common
 * and extract an interface with the common behaviour.
 * <p>
 * Put all the created classes into an array and iterate calling a method from the interface.
 */
public class Ex01Interfaces {

    public static void main(String[] args) {

        StringChanger[] stringChangers = {new Sample01("Scientists synthesize hachimoji DNA using four"), new Sample01("Bungie environment artist Vic DeLeon spent six months"),
                new Sample01("Alp DURMAZ"),
                new Sample01("CodingNomads"), new Sample01("java group"), new Sample02("successor, after the death"),
                new Sample02("The 71st Academy Awards ceremony"),
                new Sample02("An original Xbox One home video"), new Sample02("cluding areas for technical issues")};


        for (int i = 0; i < stringChangers.length; i++) {
            System.out.println("INPUT");
            System.out.println(stringChangers[i].toString());
            System.out.println("OUTPUT");
            System.out.println(stringChangers[i].reverse());
            System.out.println(stringChangers[i].randomChange());

        }
    }
}


class Sample01 implements StringChanger {
    private String string;

    public Sample01(String string) {
        this.string = string;
    }

    @Override
    public String reverse() {

        System.out.println("SAMPLE01 REVERSE METHOD WORKING");

        String result = "";

        for (int i = string.length() - 1; i >= 0; --i) {
            result += string.charAt(i);
        }

        return result;
    }

    @Override
    public String randomChange() {

        System.out.println("SAMPLE01 RANDOMCHANGE METHOD WORKING");

        Random random = new Random();

        String result = "";

        int count = string.length();

        while (count-- > 0) {
            int index = random.nextInt(string.length());

            result += string.charAt(index);
        }

        return result;
    }

    public String mask() {

        System.out.println("SAMPLE01 MASK METHOD WORKING");

        String result = "";

        for (int i = 0; i < string.length(); ++i) {
            result += "*";
        }

        return result;
    }

    @Override
    public String toString() {
        return string;
    }
}

class Sample02 implements StringChanger {
    private String string;

    public Sample02(String string) {
        this.string = string;
    }

    @Override
    public String reverse() {

        System.out.println("SAMPLE02 REVERSE METHOD WORKING");

        String result = "";

        for (int i = string.length() - 1; i >= 0; --i) {
            result += string.toUpperCase().charAt(i);
        }

        return result;
    }

    @Override
    public String randomChange() {

        System.out.println("SAMPLE02 RANDOMCHANGE METHOD WORKING");

        Random random = new Random();

        String result = "";

        int count = string.length();

        for (int i = 0; i < string.length(); i++) {

            int number = random.nextInt(100);

            char ch = string.charAt(i);

            ch += number;

            result += ch;
        }

        return result;
    }

    @Override
    public String toString() {
        return string;
    }
}


interface StringChanger {
    String reverse();

    String randomChange();
}