package classes;

public class BananaBasket {

    private int numberOfBananas = 10;

    public int getNumberOfBananas() {
        return numberOfBananas;
    }

    public void setNumberOfBananas(int bananasEaten) {
        numberOfBananas-=bananasEaten;
        System.out.println("We only have " + numberOfBananas + " left");
    }

}
