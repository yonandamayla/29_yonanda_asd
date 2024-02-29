public class PersegiPanjang29 {
    public int panjang;
    public int lebar;

    public PersegiPanjang29(int p, int l) {
        panjang = p;
        lebar =l;
    }

    public void cetakInfo() {
        
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}