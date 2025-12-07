public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    private int jumlahRudal;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    void jelajah(int jarak) {
        int kebutuhanEnergi = jarak * 3;
        if (getLevelEnergi() >= kebutuhanEnergi) {
            kurangiEnergi(kebutuhanEnergi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        tambahEnergi(jumlah);
        System.out.println("Energi berhasil ditingkatkan.");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal menembak! Jumlah rudal tidak cukup.");
        }
    }
}
