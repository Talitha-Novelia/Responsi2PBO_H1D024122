public class UjiSDM {
    public static void main(String[] args) {
        
        System.out.println("=== PENGUJIAN SISTEM SDM ===");

        // 1. BUAT OBJEK ProgrammerMagang
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");
        
        // 2. PENGUJIAN METODE BERURUTAN
        System.out.println("\n--- Tes Gaji dan Cuti ---");
        // Panggil method hitungGaji(160).
        andi.hitungGaji(160);
        
        // Cetak hasil dari method getStatusCuti().
        System.out.println("Status Cuti: " + andi.getStatusCuti());
        
        System.out.println("\n--- Tes Akses Sistem ---");
        // Panggil login("9999") (Tes PIN salah).
        andi.login("9999");
        
        // Panggil login("1234") (Tes PIN benar).
        andi.login("1234");
        
        // Cetak hasil dari method getRoleAkses().
        System.out.println("Role Akses: " + andi.getRoleAkses());
        
        System.out.println("\n--- Tes Kontrak ---");
        // Panggil perpanjangKontrak(6).
        andi.perpanjangKontrak(6);
        
        System.out.println("\n--- Tes Logout ---");
        // Panggil logout().
        andi.logout();
    }
}
