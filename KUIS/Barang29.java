public class Barang29 {
    String kode;
    String nama;
    double harga;
    int stok;

    public Barang29(String nama, String kode, double harga, int stok) {
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
        this.stok = stok;
    }

    public void cetakInfo() {
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("| %-20s | %-5s | %-10s | %-5s |\n", "Nama Barang", "Kode", "Harga", "Stok");
        System.out.printf("| %-20s | %-5s | %-10.2f | %-5d |\n", nama, kode, harga, stok);
    }
}
