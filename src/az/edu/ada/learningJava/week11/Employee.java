package az.edu.ada.learningJava.week11;


import java.util.*;
import java.util.function.Function;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("A", "Z", 2000),
                new Employee("M", "G", 10000),
                new Employee("B", "Y", 12341),
                new Employee("C", "L", 9999),
                new Employee("O", "P", 1111)
        ));

        Function<Employee, String> formatCard = (e) ->
                (String.format(
                        "name: [%s, %s] - salary: %.2f",
                        e.getFirstName(), e.getLastName(), e.getSalary())
                );
        Function<Employee, Double> salaryPicker = Employee::getSalary;

        employees.forEach((e) -> {
            System.out.println(formatCard.apply(e));
            System.out.println(salaryPicker.apply(e));
        });
    }
}
