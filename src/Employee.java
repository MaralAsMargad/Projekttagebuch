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
        Employee employee1 = new Employee("Name: " + "Maral","Batchuluun ", 1, 25);
        System.out.print(employee1.printAll());
    }
}
