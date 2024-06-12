import java.util.ArrayList;
import java.util.List;

public class SafeCar {
	    public static void main(String[] args) {
	        List<Customer> customers = new ArrayList<>();
	        List<Vehicle> vehicles = new ArrayList<>();
	        List<InsurancePolicy> policies = new ArrayList<>();
	        List<InsuranceContract> contracts = new ArrayList<>();

	        addCustomer(customers, new Customer("Maria", "Papadopoulou", "2310264368", "maria.papadopoulou@gmail.com", "AO79432"));
	        addCustomer(customers, new Customer("Evanthia", "Papagianni", "2310245368", "evanthia.papagianni@gmail.com", "AO77813"));
	        addCustomer(customers, new Customer("Vasilis", "Karagiannis", "2310245668", "ioannis.karagiannis@gmail.com", "AO45698"));

	        addVehicle(vehicles, new Vehicle("Mercedes", "GLC", "XKP8923", "2020", "7C3FR76A515072256"));
	        addVehicle(vehicles, new Vehicle("Subaru", "Forester", "NII4269", "2018", "7C3FR76A555071465"));
	        addVehicle(vehicles, new Vehicle("Ford", "Ranger", "KOH4681", "2022", "7C3FR76A55504645"));

	        policies.add(new InsurancePolicy("MI93", "Mikti asfalisi", 6));
	        policies.add(new InsurancePolicy("B56", "Basiki asfalisi", 6));
	        policies.add(new InsurancePolicy("O58", "Me odiki", 6));

	        contracts.add(new InsuranceContract(customers.get(0), vehicles.get(0), policies.get(1), 60));
	        contracts.add(new InsuranceContract(customers.get(1), vehicles.get(1), policies.get(0), 120));
	        contracts.add(new InsuranceContract(customers.get(1), vehicles.get(2), policies.get(2), 80));

	        for (InsuranceContract contract : contracts) {
	            System.out.println(contract.getCustomer().getName() + " " +
	                               contract.getVehicle().getPinakida() + " " +
	                               contract.getPolicy().getPerigrafi() + " " +
	                               contract.getKostos() + " ευρώ");
	        }

	        for (Customer customer : customers) {
	            double totalCost = 0;
	            StringBuilder vehicleList = new StringBuilder();
	            for (InsuranceContract contract : contracts) {
	                if (contract.getCustomer().equals(customer)) {
	                    totalCost += contract.getKostos();
	                    vehicleList.append(contract.getVehicle().getPinakida()).append(" ");
	                }
	            }
	            System.out.println(customer.getName() + " " + customer.getLastName() + ": " + vehicleList.toString().trim() + " - Συνολικό κόστος: " + totalCost + " ευρώ");
	        }
	    }

	    private static void addCustomer(List<Customer> customers, Customer customer) {
	        if (!customers.contains(customer)) {
	            customers.add(customer);
	        }
	    }

	    private static void addVehicle(List<Vehicle> vehicles, Vehicle vehicle) {
	        if (!vehicles.contains(vehicle)) {
	            vehicles.add(vehicle);
	        }
	    }
}

