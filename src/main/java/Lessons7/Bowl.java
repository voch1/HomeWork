package Lessons7;

public class Bowl {
    public int foodAmount;

    public void putFood(){
        int amount = (int) (Math.random() * 20 + 120);
        this.foodAmount += amount;
        System.out.printf("Food increased by %d pts, there is now %d\n", amount, foodAmount);
    }
    public boolean decreaseFood(int amount){
        this.foodAmount -= amount;
        if (foodAmount < 0){
            return false;
        } return true;
    }

    public int getFoodAmount() {
        if (foodAmount < 0) {
            System.out.println("There is no food in the bowl.");
        }
        return foodAmount;
    }
}
