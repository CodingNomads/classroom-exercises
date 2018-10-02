package javafundamentals.classes;

public class MonkeyCage {
    private int numberOfMonkeys;
    private Monkey monkey;

    public Monkey getMonkey() {
        return monkey;
    }

    public void setMonkey(Monkey monkey1) {
        this.monkey = monkey;
    }

    public int getNumberOfMonkeys() {
        return numberOfMonkeys;
    }

    public void setNumberOfMonkeys(int numberOfMonkeys) {
        this.numberOfMonkeys = numberOfMonkeys;
    }
}
