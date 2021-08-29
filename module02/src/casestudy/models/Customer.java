package casestudy.models;

public class Customer extends Person{
    private int idCustomer;
    private String typeCustomer;

    public Customer() {
    }

    public Customer(int idCustomer, String typeCustomer) {
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
    }

    public Customer(int id, String name, int age, String address, String gender, int phoneNumber, String email, int idCustomer, String typeCustomer) {
        super(id, name, age, address, gender, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
}
