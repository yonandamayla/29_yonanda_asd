public class Mahasiswa29 {
    String nama;
    int nim;
    char jenisKelamin;
    double ipk;

    public Mahasiswa29(String name, int nim,char jk, double ipk2 ) {
        nama = name;
        this.nim = nim;
        jenisKelamin = jk;
        ipk = ipk2;
    }

    public void cetakInfo() {
        System.out.println("Nama : " + nama + ", NIM : "+ nim + ", Jenis Kelamin : " + jenisKelamin +", IPK : " + ipk);
    }

    public double getIpk() {
        return ipk;
    }
}
