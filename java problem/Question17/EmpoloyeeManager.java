class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee {
    private String department;
    public Manager(String name, double salary, String department) {

        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public void displayDetails() {

        super.displayDetails();
    
        System.out.println("Department: " + department);
    }
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 85000.00, "IT");
        mgr.setName("Bob");          
        mgr.setSalary(95000.00);      
        mgr.setDepartment("Finance"); 
        System.out.println("Manager Details:");
        mgr.displayDetails();        
    }
}
