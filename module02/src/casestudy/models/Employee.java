package casestudy.models;

public class Employee extends Person{
    private int idEmployee;
    private String position;
    private float salary;

    public Employee() {
    }

    public Employee(int idEmployee, String position, float salary) {
        this.idEmployee = idEmployee;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, int age, String address, String gender, int phoneNumber, String email, int idEmployee, String position, float salary) {
        super(id, name, age, address, gender, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.position = position;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
