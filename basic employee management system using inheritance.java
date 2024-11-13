class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void manageTeam() {
        System.out.println(name + " is managing a team of " + teamSize + " employees.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}

class SalesPerson extends Employee {
    private double salesTarget;

    public SalesPerson(String name, int id, double salary, double salesTarget) {
        super(name, id, salary);
        this.salesTarget = salesTarget;
    }

    public void makeSale(double saleAmount) {
        if (saleAmount >= salesTarget) {
            System.out.println(name + " made a sale of $" + saleAmount + " and achieved the sales target!");
        } else {
            System.out.println(name + " made a sale of $" + saleAmount + ", but didn't reach the sales target.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sales Target: $" + salesTarget);
    }
}

public class R192210646 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 80000, 5);
        SalesPerson salesperson = new SalesPerson("Bob", 102, 50000, 10000);

        System.out.println("Manager Details:");
        manager.displayInfo();
        manager.manageTeam();
        System.out.println("Salesperson Details:");
        salesperson.displayInfo();
        salesperson.makeSale(12000);
        salesperson.makeSale(8000);
    }
}
