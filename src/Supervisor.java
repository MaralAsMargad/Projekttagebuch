public class Supervisor extends Employee{
    private int supervisorId;
    private float salary;

    public Supervisor(String ln, String fn, int empId, int a, int supId) {
        super(ln, fn, empId, a);
        supervisorId = supId;
        age = a;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getSupervisorId() {
        return supervisorId;
    }
    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    public void increaseSalary(float amount) {
        this.salary += amount;
    }

    @Override
    public String printAll() {
        return fullName() + " Employee ID: " + getEmployeeId()
                + " Supervisor ID: " + supervisorId
                + " Age: " + age
                + " Salary: " + salary;
    }

    public static void main(String[] args) {
        Supervisor supervisor1 = new Supervisor("Sengwein", "Mario", 100, 30, 10);
        supervisor1.setSalary(2000);
        supervisor1.increaseSalary(500);
        System.out.println(supervisor1.printAll());
    }

}
