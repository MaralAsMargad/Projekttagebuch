public class Supervisor extends Employee{
    private int supervisorId;
    private float salary;

    public Supervisor(String ln, String fn, int supId, int a) {
        super(ln, fn);
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

    public float salaryIncrease(){
        return salary = salaryIncrease() + 10;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }


}
