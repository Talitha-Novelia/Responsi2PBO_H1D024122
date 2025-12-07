public class EWalletPayment implements PaymentMethod {

    private String providerName;
    private double balance;
    private double transactionAmount;
    private final double FEE = 1000.0; // Biaya admin contoh

    public EWalletPayment(String providerName, double balance, double transactionAmount) {
        this.providerName = providerName;
        this.balance = balance;
        this.transactionAmount = transactionAmount;
    }

    @Override
    public double getTransactionFee() {
        return FEE;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getPaymentDetails() {
        return "E-Wallet: " + providerName +
               "\nSaldo Awal: " + balance +
               "\nNominal Transaksi: " + transactionAmount +
               "\nBiaya Admin: " + getTransactionFee() +
               "\nTotal Bayar: " + (transactionAmount + getTransactionFee());
    }

    @Override
    public void processPayment() {
        double total = transactionAmount + getTransactionFee();
        if (balance >= total) {
            balance -= total;
            System.out.println("Pembayaran Berhasil! Sisa Saldo: " + balance);
        } else {
            System.out.println("Pembayaran Gagal! Saldo tidak mencukupi. (Total: " + total + ", Saldo: " + balance + ")");
        }
    }
}
