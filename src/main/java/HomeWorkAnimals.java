import java.util.concurrent.Callable;

public class HomeWorkAnimals {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "Black");
        Cat cat1 = new Cat("Murzik", "Red");
        Cat cat2 = new Cat("Kashtan", "White");
        Dog dog = new Dog("Mishka", "White");
        Dog dog1 = new Dog("Bobik", "Grey");
        Dog dog2 = new Dog("Tuzik", "Red");
        dog.run(600);
        cat.run(300);
        dog.swim(11);
        cat.swim(5);
        dog1.run(200);
        dog1.swim(8);
        cat1.run(100);
    }
}
