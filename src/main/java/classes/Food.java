package classes;

class Food{
    protected int calories;

    public Food(int calories){
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}