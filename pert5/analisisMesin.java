class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] mesin = new defaultMesin[5];

        // Isi array dengan objek mesin
        mesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        mesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        mesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        mesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        mesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for (defaultMesin m : mesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin m : mesin) {
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                 // Check Listrik BEFORE Traktor because Listrik IS-A Traktor
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin highest = mesin[0];
        for (defaultMesin m : mesin) {
            if (m.nilaiPerforma() > highest.nilaiPerforma()) {
                highest = m;
            }
        }
        System.out.println(highest.namaMesin + " \u2192 " + highest.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi (Bubble Sort Descending)
        for (int i = 0; i < mesin.length - 1; i++) {
            for (int j = 0; j < mesin.length - 1 - i; j++) {
                if (mesin[j].nilaiPerforma() < mesin[j + 1].nilaiPerforma()) {
                    defaultMesin temp = mesin[j];
                    mesin[j] = mesin[j + 1];
                    mesin[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + mesin[i].namaMesin + " \u2192 " + mesin[i].nilaiPerforma());
        }
    }
}
