public class BBM14 {
    String namBBM;
    double hargaPerLiter;

    public BBM14(String namBBM, double hargaPerLiter) {
        this.namBBM = namBBM;
        this.hargaPerLiter = hargaPerLiter;
    }

    public static BBM14[] listBBM = {
        new BBM14("Pertalite", 10000),
        new BBM14("Pertamax", 12400),
        new BBM14("Biosolar", 6800),
        new BBM14("DexLite", 13400)
    };

    public static void tampilBBM() {
        System.out.printf("%-20s %-20s%n", "Jenis BBM", "Harga"); 
        for (BBM14 b : listBBM) {
            System.out.printf("%-20s %-20.0f%n", b.namBBM, b.hargaPerLiter);
        }
    }

    public static BBM14 cariBBM(String namBBM) {
        for (BBM14 b : listBBM) {
            if (b.namBBM.equalsIgnoreCase(namBBM)) return b;
        }
        return null;
    }
}