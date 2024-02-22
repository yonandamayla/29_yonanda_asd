public class Buku29 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman :" + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga: RP " + harga);
    }

    void terjual(int jml) {
        if (stok > 0 && jml <= stok) {
            stok -= jml;
            System.out.println(jml + " buku terjual.");
        } else {
            System.out.println("Stok tidak mencukupi untuk menjual " + jml + " buku.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku29 (){

    }
    
    public Buku29 (String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    
}