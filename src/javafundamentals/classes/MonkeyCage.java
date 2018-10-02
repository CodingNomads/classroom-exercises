package javafundamentals.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonkeyCage {
    private List<Monkey> monkeyList = new ArrayList<>();

    public MonkeyCage(Monkey... monkeys) {
        monkeyList.addAll(Arrays.asList(monkeys));
    }

    public void feedMonkeyBanana (Monkey monkeyToBeFed,BananaBasket bananaBasket) {
        if (monkeyList.indexOf(monkeyToBeFed) != -1) {
            monkeyList.get(monkeyList.indexOf(monkeyToBeFed)).eatBanana(bananaBasket);
        } else {
            System.out.println("This monkey is not in this cage!");
        }
    }
}
