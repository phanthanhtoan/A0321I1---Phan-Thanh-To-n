package casestudy.models;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, int age, String address, String gender, int phoneNumber, String email, String position, double salary) {
        super(id, name, age, address, gender, phoneNumber, email);
        this.position = position;
        this.salary = salary;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
