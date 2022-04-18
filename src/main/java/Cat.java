public class Cat extends Animals {
public static int catNumber;
    public Cat(String name, String color){
        super(name, color);
        number++;
        catNumber++;
        System.out.printf("Cat name - %s and color - %s\n", name, color);
        numberOfAnimals();
        numberOfCats();
    }
    @Override
    public void run(int length) {
        if (length > 201) {
            System.out.printf("%s ran 200 and got tired and lay down to rest.\n", name);
        } else {
            System.out.printf("%s ran %d meters and is very happy!\n", name, length);
        }
    }
    @Override
    public void swim(int length){
        if(length < 11){
            System.out.printf("%s wanted to swim %d meters, but began to sink. He was rescued by a dog\n", name, length);
        } else{
            System.out.printf("%s wanted to swim %d meters, but drowned. He was rescued by a human.\n", name, length);
        }
    }
    public void numberOfCats(){
        System.out.println("Cat is " + catNumber);
    }
}