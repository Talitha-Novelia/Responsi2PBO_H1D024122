class mesinTraktor extends defaultMesin {
    double kapasitasTarik;

    // Constructor
    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Traktor " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor";
    }

    void suaraMesin() {
        System.out.println(namaMesin + " \u2192 GGGRRRR! Hidup Mesinnn!");
    }
}
