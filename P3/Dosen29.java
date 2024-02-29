public class Dosen29 {
    String namaDosen;
    String nipdn;
    String kelasDiajar;
    String mataKuliahDiampu;

    public Dosen29(String namaDosen, String nipdn, String kelasDiajar, String mataKuliahDiampu) {
        this.namaDosen = namaDosen;
        this.nipdn = nipdn;
        this.kelasDiajar = kelasDiajar;
        this.mataKuliahDiampu = mataKuliahDiampu;
    }

    public void cetakInfo() {
        System.out.println("Nama Dosen: " + namaDosen + ", NIPDN: " + nipdn +
                ", Kelas yang Diajar: " + kelasDiajar + ", Mata Kuliah yang Diampu: " + mataKuliahDiampu);
    }
}
