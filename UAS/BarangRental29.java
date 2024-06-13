class BarangRental29 {
    private String noTNKB;
    private String namaKendaraan;
    private String jenisKendaraan;
    private int tahun;
    private boolean isRented;

    public BarangRental29(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.isRented = false;
    }

    public String getNoTNKB() {
        return noTNKB;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public int getTahun() {
        return tahun;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }

    public int getBiayaSewa() {
        if (jenisKendaraan.equalsIgnoreCase("motor")) {
            return 25000;
        } else if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            return 40000;
        }
        return 0;
    }
}
