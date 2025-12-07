public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    
    // Attributes
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;
    
    // Constructor
    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }
    
    // KaryawanKontrak Implementation
    @Override
    public double hitungGaji(int jamKerja) {
        double total = jamKerja * gajiPerJam;
        System.out.println("Total Gaji (Magang): Rp " + total);
        return total;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak atas nama " + nama + " diperpanjang selama " + durasiBulan + " bulan.");
    }

    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari (Khusus Magang)";
    }

    // AksesSistem Implementation
    @Override
    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true;
            System.out.println("Login Berhasil! Selamat datang, " + nama);
        } else {
            System.out.println("Login Gagal! PIN salah.");
        }
    }

    @Override
    public void logout() {
        sedangLogin = false;
        System.out.println("Logout berhasil. Sampai jumpa!");
    }

    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }
}
