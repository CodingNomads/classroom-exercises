package classes;

public class BananaBasket {

    private int numberOfBananas;

    public int getNumberOfBananas() {
        return numberOfBananas;
    }

    public void setNumberOfBananas(int numberOfBananas) {
        this.numberOfBananas = numberOfBananas;
    }

    public void eatOneBanana() {
        numberOfBananas--;
    }

}
