public class Employee {
    private String name;
    private String capacity;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String name, String capacity, String email, String telephone, int salary, int age){
        this.name = name;
        this.capacity = capacity;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public int Age(){
        return this.age;
    }
    @Override
    public String toString(){
        return String.format("New Employee: name - %s, capacity - %s, email - %s, telephone - %s, salary - %s, age - %s\n",
                name, capacity, email, telephone, salary, age);
    }
}
