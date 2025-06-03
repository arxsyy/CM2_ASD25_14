public class BBM14 {
    String namaBBM;
    double hargaPerLiter;

    public BBM14 (String namaBBM, double hargaPerLiter) {
        this.namaBBM = namaBBM;
        this.hargaPerLiter = hargaPerLiter;
    }

    void tampilInfo() {
        System.out.printf("%-20s %-20f");
    }
}