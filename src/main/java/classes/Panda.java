package classes;

class Panda extends Animal{
    private boolean hadFed;
    private boolean isPregnant;

    public Panda(String specy, String gender, int age){
        super(specy,gender,age);
    }

    public void isPregnant(boolean isPregnant){
        if(gender.compareToIgnoreCase("Male") == 0) {
            this.isPregnant = false;
            return;
        }

        this.isPregnant = isPregnant;
    }

    public void feed(PandaFood pandaFood, int foodAmount){

        if(isPregnant && pandaFood.hadDrugs && foodAmount == 1000) {
            hadFed = true;
            pandaFood.feed(foodAmount);
            return;
        }

        if(!isPregnant && foodAmount == 500) {
            hadFed = true;
            pandaFood.feed(foodAmount);
        }
    }

    public boolean isHadFed() {
        return hadFed;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setHadFed(boolean hadFed) {
        this.hadFed = hadFed;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    @Override
    public String toString() {
        return "Panda{" +
                "hadFed=" + hadFed +
                ", isPregnant=" + isPregnant +
                ", specy='" + specy + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}