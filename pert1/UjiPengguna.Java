class UjiPengguna {
    public static void main(String[] args) {
        Pengguna p = new Pengguna();
        p.umur = 25;
        p.berat = 60;
        p.tinggi = 170;

        p.tampilInfo();

        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");
        
        // p.faktorAktivitas = 1.5; // Ini akan menyebabkan error compile time
    }
}