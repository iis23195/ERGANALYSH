
public class InsuranceContract {
	private Customer customer;
    private Vehicle vehicle;
    private InsurancePolicy policy;
    private double kostos;

    public InsuranceContract(Customer customer, Vehicle vehicle, InsurancePolicy policy, double kostos) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.policy = policy;
        this.kostos = kostos;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public InsurancePolicy getPolicy() {
        return policy;
    }

    public double getKostos() {
        return kostos;
    }
}
