public class Kendaraan14 {
    String platNomor;
    String tipe;
    String merk;

    public Kendaraan14 (String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    void tampilInfo() {
        System.out.printf("%-20s %-20s %-20s", this.platNomor, this.tipe, this.merk);
    }
}