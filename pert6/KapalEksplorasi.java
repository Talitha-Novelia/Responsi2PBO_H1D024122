public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    private int modulScan; // level 1-5


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    void jelajah(int jarak) {
        int kebutuhanEnergi = jarak * 2;
        if (getLevelEnergi() >= kebutuhanEnergi) {
            kurangiEnergi(kebutuhanEnergi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        tambahEnergi(jumlah);
        System.out.println("Energi kapal eksplorasi diisi.");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}
