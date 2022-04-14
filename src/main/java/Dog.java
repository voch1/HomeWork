public class Dog extends Animals{
public static int dogNumber;

    public Dog(String name, String color){
        super(name, color);
        number++;
        dogNumber++;
        System.out.printf("Dog name - %s and color - %s\n", name, color);
        numberOfAnimals();
        numberOfDogs();
    }
    @Override
    public void run(int length){
        if(length > 501){
            System.out.printf("%s ran 500 meters and got tired and lay down to rest.\n", name);
        } else{
            System.out.printf("%s ran %d meters and is very happy!\n", name, length);
        }
    }
    @Override
    public void swim(int length){
        if(length < 11){
            System.out.printf("%s swam %d meters and was very happy.\n", name, length);
        } else{
            System.out.printf("%s swam %d meters, but drowned. He was rescued by a human\n", name, length);
        }
    }
    public void numberOfDogs(){
        System.out.println("Dog is " + dogNumber);
    }
}
