package javafundamentals.classes;

public class Banana {
    private boolean isRipe;
    private String bananaType;

    @Override
    public String toString() {
        return bananaType;
    }

    public String getBananaType() {
        return bananaType;
    }

    public void setBananaType(String bananaType) {
        this.bananaType = bananaType;
    }

    public boolean isRipe() {
        return isRipe;
    }

    public void setRipe(boolean ripe) {
        isRipe = ripe;
    }
}
