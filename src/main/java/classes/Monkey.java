package classes;

public class Monkey extends MonkeyCage {

    public void eatBanana(Banana element) {

        System.out.println("Ah ah ooh ooh ooh me want to eat banana!");

        BananaBasket.numberOfBananas--;

        System.out.println("Basket now only have " + BananaBasket.numberOfBananas + " bananas - Nooooo!");

    }

}
