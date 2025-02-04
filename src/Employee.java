public class Employee extends Person{
    private int employeeId;

    public Employee(String ln, String fn, int empId, int a) {
        super(ln, fn);
        employeeId = empId;
        age = a;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String printAll(){
       return fullName() + employeeId + age;
    }

    public static void main(String[] args) {
        Employee ceo = new Employee("Name: " + "Doe","Jane ", 1, 25);
        System.out.print(ceo.printAll());
    }
}
