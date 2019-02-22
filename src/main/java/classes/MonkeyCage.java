package classes;

public class MonkeyCage {

    int[] enclosureSize;
    int enclosureMaxCapacity;
    int enclosureCurrentCapacity;
    String enclosureType;
    int numMonkey;

    public int addMonkey() {
        if (enclosureMaxCapacity == numMonkey) {
            System.out.println("Cage is full. Can't add any more monkeys");
        } else {
            numMonkey++;
        }

        return numMonkey;
    }

    public MonkeyCage(int[] enclosureSize) {
        this.enclosureSize = enclosureSize;
    }

    public void setEnclosureType(String enclosureType) {
        this.enclosureType = enclosureType;
    }

    public int getEnclosureCurrentCapacity() {
        return (enclosureMaxCapacity - numMonkey);
    }

    public void setEnclosureCurrentCapacity(int enclosureCurrentCapacity) {
        this.enclosureCurrentCapacity = enclosureCurrentCapacity;
    }

    public int getEnclosureMaxCapacity() {
        return enclosureMaxCapacity;
    }

    public void setEnclosureMaxCapacity(int enclosureMaxCapacity) {
        this.enclosureMaxCapacity = enclosureMaxCapacity;
    }
}
