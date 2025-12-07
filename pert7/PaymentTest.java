public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN PEMBAYARAN E-WALLET ===");
        
        // Buat objek dari EWalletPayment: Provider OVO, Saldo 50000, Bayar 20000
        EWalletPayment ovo = new EWalletPayment("OVO", 50000, 20000);
        
        // 1. Menampilkan data sebelum transaksi
        System.out.println("\n--- Detail Pembayaran ---");
        System.out.println(ovo.getPaymentDetails());
        
        // 2. Memproses pembayaran
        System.out.println("\n--- Proses Pembayaran ---");
        ovo.processPayment();
        
        // 3. Menampilkan saldo akhir
        System.out.println("\n--- Status Akhir ---");
        System.out.println("Saldo saat ini: " + ovo.getBalance());
        
        System.out.println("\n-------------------------------------");
        
        // Test Gagal (Saldo kurang)
        EWalletPayment gopay = new EWalletPayment("GoPay", 10000, 20000);
        System.out.println("\n--- Detail Pembayaran (Kasus Gagal) ---");
        System.out.println(gopay.getPaymentDetails());
        
        System.out.println("\n--- Proses Pembayaran ---");
        gopay.processPayment();
    }
}
