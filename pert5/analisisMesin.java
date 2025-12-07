import java.util.Arrays;
import java.util.Comparator;

class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] invMesin = new defaultMesin[5];
        invMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        invMesin[1] = new mesinTraktor("Kubota MX5200", 520, 4.5);
        invMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        invMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        invMesin[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);
        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin m : invMesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin m : invMesin) {
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                if (m instanceof mesinTraktorListrik) {
                    ((mesinTraktorListrik) m).suaraMesin();
                } else {
                    ((mesinTraktor) m).suaraMesin();
                }
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin tertinggi = invMesin[0];
        for (defaultMesin m : invMesin) {
            if (m.nilaiPerforma() > tertinggi.nilaiPerforma()) {
                tertinggi = m;
            }
        }
        System.out.println(tertinggi.namaMesin + " -> " + tertinggi.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        Arrays.sort(invMesin, new Comparator<defaultMesin>() {
            @Override
            public int compare(defaultMesin m1, defaultMesin m2) {
                return Double.compare(m2.nilaiPerforma(), m1.nilaiPerforma()); // Descending
            }
        });

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + invMesin[i].namaMesin + " -> " + invMesin[i].nilaiPerforma());
        }
    }
}
