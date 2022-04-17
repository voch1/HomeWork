package Lessons7;

public class Cat {
    public String name;
    public int appetite;
    public int satiety;

    public Cat (String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public boolean eat(Bowl bowl) {
        bowl.decreaseFood(appetite);
        if (bowl.foodAmount < appetite){
            System.out.printf("%s did not have enough food, he did not eat anything.\n", name);
            return false;
        } else if (bowl.foodAmount < satiety){
            System.out.printf("%s did not have enough food for complete satiety.\n", name);
            return false;
        }else {
            System.out.printf("Cat %s has eaten %d food.\n", name, appetite);
            return true;
        }
    }
    public int getSatiety(){return this.satiety;}

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                " , appetite=" + appetite +
                '}';
    }
}

