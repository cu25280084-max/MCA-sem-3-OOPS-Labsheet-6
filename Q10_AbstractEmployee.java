abstract class Employee {
    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    String name;
    double basicSalary, bonus;

    Manager(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    String name;
    double monthlySalary;

    Programmer(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Q10_AbstractEmployee {
    public static void main(String[] args) {
        Employee manager = new Manager("Devesh", 50000, 10000);
        Employee programmer = new Programmer("Aman", 40000);
        manager.displayInfo();
        programmer.displayInfo();
    }
}
