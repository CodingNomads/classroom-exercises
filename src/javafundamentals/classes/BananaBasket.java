package javafundamentals.classes;

import java.util.ArrayList;
import java.util.List;

public class BananaBasket {
    private List<Banana> bananaList = new ArrayList<>();

    public void addBanana(Banana banana){
        bananaList.add(banana);
    }
    public Banana getBanana(){
        return bananaList.remove(0);
    }
}
