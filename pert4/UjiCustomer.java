public class UjiCustomer {
    public static void main(String[] args) {
        // Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // Buat object Customer
        Customer budi = new Customer("Budi Santoso", "CST-001", 500000);

        // Tampilkan info untuk Customer biasa
        System.out.println("Status: Customer Biasa");
        budi.tampilkanInfo();
        
        System.out.println(); // Jarak

        // Buat object Member
        Member siti = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // Tampilkan info untuk pelanggan Member
        System.out.println("Status: Member");
        siti.tampilkanInfo();
    }
}
