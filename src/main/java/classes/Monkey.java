package classes;

public class Monkey {

    private String monkeyName;

    public void eatOneBananaFrom(BananaBasket basket) {

        System.out.println(monkeyName + " is about to eat a banana!");
        basket.eatOneBanana();

    }

    public String getMonkeyName() {
        return monkeyName;
    }

    public void setMonkeyName(String monkeyName) {
        this.monkeyName = monkeyName;
    }



}
