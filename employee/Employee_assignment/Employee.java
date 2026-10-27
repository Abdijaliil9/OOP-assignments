package Employee_assignment;

public class Employee {
    String employeeId;
    String name;
    String department;
    double basicSalary;

    Employee(String employeeId, String name, String department, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

// Full Time Employee
class FullTimeEmployee extends Employee {
    double allowance;

    FullTimeEmployee(String employeeId, String name, String department,
                     double basicSalary, double allowance) {
        super(employeeId, name, department, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + allowance;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: Full-Time Employee");
        System.out.println("Monthly Salary: "+ calculateSalary());
    }
}

// Part Time Employee
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String employeeId, String name, String department,
                     double basicSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, department, basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: Part-Time Employee");
        System.out.println("Monthly Salary: "+calculateSalary());
    }
}

// Manager
class Manager extends Employee {
    double bonus;

    Manager(String employeeId, String name, String department,
            double basicSalary, double bonus) {
        super(employeeId, name, department, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: Manager");
        System.out.println("Monthly Salary: "+calculateSalary());
    }
}

// Main Method
class EmployeeReport {
    static void main() {

        Employee[] employees = {
                new FullTimeEmployee("EMP001", "Ahmed Ali", "IT", 500, 150),
                new PartTimeEmployee("EMP002", "Fatima Hassan", "HR", 0, 40, 6),
                new Manager("EMP003", "Mohamed Omar", "Management", 1000, 200)
        };

        System.out.println("===== EMPLOYEE SALARY REPORT =====");

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println();
        }
    }
}

