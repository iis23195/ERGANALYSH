import java.util.Objects;

public class Customer {
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String arithmosTaftotitas;

    public Customer(String name, String lastName, String phone, String email, String arithmosTaftotitas) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.arithmosTaftotitas = arithmosTaftotitas;
    }

    public String getArithmosTaftotitas() {
        return arithmosTaftotitas;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(arithmosTaftotitas, customer.arithmosTaftotitas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arithmosTaftotitas);
    }
}
