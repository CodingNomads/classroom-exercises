package classes;

public class FoodBasket{

    private String foodBasket;
    private int totalQuantity;

    public void setFoodBasket(String foodBasket){
        this.foodBasket = foodBasket;
    }

    public void eatFood(int i){
        int currentQuantity = totalQuantity - i;
        System.out.println("The food has been eaten! There are "+ currentQuantity + "left!");
    }

}
