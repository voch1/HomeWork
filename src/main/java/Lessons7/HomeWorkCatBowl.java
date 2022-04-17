package Lessons7;

public class HomeWorkCatBowl {
    public static void main(String[] args) {
        Bowl bowl = new Bowl();
        Cat cats[] = {
                new Cat("Vasya", 60, 55),
                new Cat("Barsik", 30, 25),
                new Cat("Murzuk", 40, 35)
        };
        while (true) {
            bowl.putFood();
            for (Cat cat : cats) {
                cat.eat(bowl);
                System.out.println(bowl.getFoodAmount());
            } if (bowl.foodAmount < 0){
                break;
            }
        }
    }
}
