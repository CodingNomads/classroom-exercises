package javafundamentals.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BananaBasket {
    private List<Banana> bananaList = new ArrayList<>();
    private int noOfBananas;

    public void addBananas (Banana ...bananas) {
        bananaList.addAll(Arrays.asList(bananas));
        noOfBananas = bananaList.size();
    }

    public Banana takeBanana (){
        Banana returnBanana = bananaList.remove(bananaList.size()-1);
        noOfBananas = bananaList.size();
        return returnBanana;
    }

    public int getNoOfBananas() {
        return noOfBananas;
    }
}
