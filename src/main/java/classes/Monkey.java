package classes;

public class Monkey {

    String monkeyType;
    int numMonkey;



    public int Monkey(String monkeyType) {
        this.monkeyType = monkeyType;
        numMonkey++;
        return numMonkey;
    }

    public int getNumMonkey() {
        return numMonkey;
    }

    public void setNumMonkey(int numMonkey) {
        this.numMonkey = numMonkey;
    }

    public String getMonkeyType() {
        return monkeyType;
    }

    public void setMonkeyType(String monkeyType) {
        this.monkeyType = monkeyType;
    }
}

