package javafundamentals.interfaces;

public class Englishman implements Person {


    static void makeTea(){
        System.out.println("Making a cup of tea");
    }

    @Override
    public void speak() {
        System.out.println("Speaking english");
    }

    @Override
    public void cook() {
        System.out.println("Cooking fish and chips");
    }
}
