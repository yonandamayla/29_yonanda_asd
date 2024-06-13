class TransaksiRental29 {
    private static int kodeCounter = 1;
    private int kodeTransaksi;
    private String namaPeminjam;
    private int lamaPinjam;
    private double totalBiaya;
    private BarangRental29 br;
    private boolean isMember;

    public TransaksiRental29(String namaPeminjam, int lamaPinjam, BarangRental29 br, boolean isMember) {
        this.kodeTransaksi = kodeCounter++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.isMember = isMember;
        this.totalBiaya = calculateTotalBiaya(lamaPinjam, br.getBiayaSewa(), isMember);
    }

    private double calculateTotalBiaya(int lamaPinjam, int biayaSewa, boolean isMember) {
        double biaya = lamaPinjam * biayaSewa;
        if (isMember) {
            biaya -= 25000;
        }
        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            biaya *= 0.9;
        } else if (lamaPinjam > 78) {
            biaya *= 0.8;
        }
        return biaya;
    }

    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public BarangRental29 getBr() {
        return br;
    }
}
