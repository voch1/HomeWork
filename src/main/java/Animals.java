public class Animals extends Object{
    protected String name;
    protected String color;
    public static int number;

    public Animals(){
        super();
        number++;
        System.out.println("New animal born!:)");
    }
    public Animals (String name, String color){
        this();
        this.name = name;
        this.color = color;
    }
    public String getName(){return this.name;}
    public String getColor(){return this.color;}
    public void setName(String name){this.name = name;}
    public void setColor(String color){this.color = color;}
    public void run(int length){System.out.printf("%s ran a %d meters \n", name, length);}
    public void swim(int length){System.out.printf("%s swim a %d meters\n", name, length);}
    public void numberOfAnimals(){
        System.out.println("Animals is " + number/2);
    }
}