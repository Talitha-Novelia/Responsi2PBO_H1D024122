public class UjiGalaksi {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");
        System.out.println();

        System.out.println("--- PESAWAT TEMPUR ---");
        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // Buat objek PesawatTempur dengan:
        //   nama: "Astra-Fury"
        //   kapasitas: 2
        //   jumlahRudal: 8
        PesawatTempur astra = new PesawatTempur("Astra-Fury", 2, 8);


        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        // Aktifkan mesin pesawat
        astra.aktifkanMesin();
        // Pesawat menjelajah 10 km
        astra.jelajah(10);
        // Pesawat menjelajah 30 km (will fail logic wise if 3% * 30 = 90 + 30 = 120 > 100)
        // Wait, init 100. Jelajah 10km = 30%. Sisa 70.
        // Jelajah 30km = 90%. Need 90. Have 70. Fail. Correct.
        astra.jelajah(30);
        // Pesawat menembak 3 rudal
        astra.tembakRudal(3);
        // Tampilkan status pesawat
        astra.tampilStatus();

        System.out.println();
        System.out.println("--- KAPAL EKSPLORASI ---");

        // Buat objek KapalEksplorasi dengan:
        //   nama: "Voyager X"
        //   kapasitas: 10
        //   modulScan: 4
        KapalEksplorasi voyager = new KapalEksplorasi("Voyager X", 10, 4);

        // Aktifkan mesin kapal eksplorasi
        voyager.aktifkanMesin();
        // Kapal menjelajah 15 km
        // 15 * 2% = 30%. Sisa 70%.
        voyager.jelajah(15);
        // Kapal melakukan scanPlanet("Kepler-442b")
        voyager.scanPlanet("Kepler-442b");
        // Tampilkan status kapal
        voyager.tampilStatus();
    }
}
