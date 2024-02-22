public class BukuMain29 {
    public static void main(String[] args) {
        Buku29 bk1 = new Buku29();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku29 bk2 = new Buku29("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku29 bkYonan = new Buku29("Cara manajemen waktu yang baik", "Yonanda", 200, 40, 50000);
        bkYonan.terjual(10);
        bkYonan.gantiHarga(80000);
        bkYonan.tampilInformasi();

        // Menghitung harga total, diskon, dan harga bayar
        int hargaTotal = bkYonan.hitungHargaTotal(50);
        int diskon = bkYonan.hitungDiskon(hargaTotal);
        int hargaBayar = bkYonan.hitungHargaBayar(hargaTotal, diskon);

        // Menampilkan hasil perhitungan
        System.out.println("Harga Total: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga Bayar: Rp " + hargaBayar);
    }
}
