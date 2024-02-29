public class Ruangan29 {
    String namaRuangan, fasilitas;
    int kapasitas;

    public Ruangan29(String namaRuangan, int kapasitas, String fasilitas) {
        this.namaRuangan = namaRuangan;
        this.kapasitas = kapasitas;
        this.fasilitas = fasilitas;
    }

    public void cetakInfo() {
        System.out.println(" Nama Ruangan : " + namaRuangan + ", kapasitas : " + kapasitas + "' fasilitas : " + fasilitas );
    }
}
