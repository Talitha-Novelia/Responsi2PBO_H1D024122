class Member extends Customer {
    int poinReward;
    String level;

    Member(String nama, String idCustomer, int totalBelanja, int poinReward, String level) {
        super(nama, idCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poinReward + " | Level: " + level);
    }
}
