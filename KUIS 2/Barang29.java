public class Barang29 {
    String kode;
    String nama;
    double harga;
    int stok;

    public Barang29(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    String getKode() {
        return kode;
    }

    void setKode(String kode) {
        this.kode = kode;
    }

    String getNama() {
        return nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    double getHarga() {
        return harga;
    }

    void setHarga(double harga) {
        this.harga = harga;
    }

    int getStok() {
        return stok;
    }

    void setStok(int stok) {
        this.stok = stok;
    }
}
