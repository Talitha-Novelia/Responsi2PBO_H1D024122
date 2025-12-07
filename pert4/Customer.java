class Customer {
    String nama;
    String idCustomer;
    int totalBelanja;

    Customer(String nama, String idCustomer, int totalBelanja) {
        this.nama = nama;
        this.idCustomer = idCustomer;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | ID: " + idCustomer + " | Total Belanja: Rp " + totalBelanja);
    }
}
