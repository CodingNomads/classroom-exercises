package classes;

class PandaFood extends Food{
    protected boolean hadDrugs;
    protected static int totalFood;

    public PandaFood(int calories, boolean hadDrugs, int totalFood){
        super(calories);
        this.hadDrugs = hadDrugs;
        this.totalFood = totalFood;
    }

    void feed(int foodAmount){
        totalFood -= foodAmount;
    }

    public boolean isHadDrugs() {
        return hadDrugs;
    }

    public static int getTotalFood() {
        return totalFood;
    }

    public void setHadDrugs(boolean hadDrugs) {
        this.hadDrugs = hadDrugs;
    }

    public static void setTotalFood(int totalFood) {
        PandaFood.totalFood = totalFood;
    }

    @Override
    public String toString() {
        return "PandaFood{" +
                "hadDrugs=" + hadDrugs +
                ", calories=" + calories +
                ", total food=" + totalFood +
                '}';
    }
}