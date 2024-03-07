public class TransaksiBarang29 {
    Barang29[] barangs;
    int[] jumlahPembelian;

    public TransaksiBarang29(int jumlahPembelian) {
        this.barangs = new Barang29[jumlahPembelian];
        this.jumlahPembelian = new int[jumlahPembelian];
    }

    public void tampilkanBarangPembelian() {
        System.out.println("Daftar Pembelian:");
        for (int i = 0; i < barangs.length; i++) {
            if (jumlahPembelian[i] > 0) {
                System.out.println("Kode: " + barangs[i].kode);
                System.out.println("Nama: " + barangs[i].nama);
                System.out.println("Harga: " + barangs[i].harga);
                System.out.println("Jumlah Pembelian: " + jumlahPembelian[i]);
                System.out.println("---------------------------");
            }
        }
    }

    public void tambahPembelian(Barang29 barang) {
        for (int i = 0; i < barangs.length; i++) {
            if (barangs[i] == null) {
                barangs[i] = barang;
                jumlahPembelian[i] = 0;
                return;
            }
        }
    }

    public void melakukanPembelian(String kodeBarang, int jumlah) {
        for (int i = 0; i < barangs.length; i++) {
            if (barangs[i] != null && barangs[i].kode.equals(kodeBarang)) {
                if (barangs[i].stok >= jumlah) {
                    barangs[i].stok -= jumlah;
                    jumlahPembelian[i] += jumlah;
                    System.out.println("Pembelian berhasil dilakukan");
                } else {
                    System.out.println("Stok barang tidak mencukupi untuk pembelian ini");
                }
                return;
            }
        }
        System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan");
    }
}
