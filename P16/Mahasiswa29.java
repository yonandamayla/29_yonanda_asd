public class Mahasiswa29 {
    String nim, nama, noTelp;

    public Mahasiswa29() {

    }

    public Mahasiswa29(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return "Mahasiswa29{" +"nim= " + nim + ", nama= " + nama + ", noTelp= " + noTelp + '}';
    }
}
