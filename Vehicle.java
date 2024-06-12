import java.util.Objects;


public class Vehicle {
	private String marka;
    private String modelo;
    private String year;
    private String pinakida;
    private String arithmosPlaisiou;

    public Vehicle(String marka, String modelo, String pinakida, String year, String arithmosPlaisiou) {
        this.marka = marka;
        this.modelo = modelo;
        this.year = year;
        this.pinakida = pinakida;
        this.arithmosPlaisiou = arithmosPlaisiou;
    }

    public String getArithmosPlaisiou() {
        return arithmosPlaisiou;
    }

    public String getPinakida() {
        return pinakida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(arithmosPlaisiou, vehicle.arithmosPlaisiou);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arithmosPlaisiou);
    }
}
