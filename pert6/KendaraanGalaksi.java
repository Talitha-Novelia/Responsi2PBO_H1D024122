public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================

    private String namaKendaraan;
    private int levelEnergi; // 0–100
    private int kapasitasPenumpang;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // Default
    }


    // ==========================================================
    // GETTER & HELPER
    // ==========================================================

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }
    
    // Protected methods to allow subclasses to modify state
    protected void setLevelEnergi(int level) {
        if (level > 100) this.levelEnergi = 100;
        else if (level < 0) this.levelEnergi = 0;
        else this.levelEnergi = level;
    }
    
    protected void kurangiEnergi(int jumlah) {
        setLevelEnergi(this.levelEnergi - jumlah);
    }
    
    protected void tambahEnergi(int jumlah) {
        setLevelEnergi(this.levelEnergi + jumlah);
    }


    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " awak");
    }


    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    abstract void aktifkanMesin();
    abstract void jelajah(int jarak);
    abstract void isiEnergi(int jumlah);
}
