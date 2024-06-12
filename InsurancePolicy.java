
public class InsurancePolicy {
    private String kodikosPaketou;
    private String perigrafi;
    private int diarkeia;

    public InsurancePolicy(String kodikosPaketou, String perigrafi, int diarkeia) {
        this.kodikosPaketou = kodikosPaketou;
        this.perigrafi = perigrafi;
        this.diarkeia = diarkeia;
    }

    public String getPerigrafi() {
        return perigrafi;
    }
}
