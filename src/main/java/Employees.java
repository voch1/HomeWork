public class Employees {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivan Ivanov", "Director", "ivanov76@gmail.com", "+48673673", 9000, 51),
                new Employee("Vasyl Naumov", "Accountant", "naumov76@gmail.com", "+48673673", 7500, 48),
                new Employee("Georgiy Bely", "Worker", "bely76@gmail.com", "+48673673", 6000, 41),
                new Employee("Andrey Bedny", "Worker", "bedny76@gmail.com", "+48673673", 6000, 23),
                new Employee("Anna Ivanova", "Secretary", "ivanova76@gmail.com", "+48673673", 6000, 28),
        };
        for (Employee employee : employees){
            if(employee.Age() > 40){
                System.out.println(employee);
            }
        }

    }
}
