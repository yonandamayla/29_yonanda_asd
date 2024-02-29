import java.util.Scanner;

public class DosenMain29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc29.nextInt();

        Dosen29[] dosenArray = new Dosen29[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            sc29.nextLine(); 
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Nama Dosen: ");
            String namaDosen = sc29.nextLine();
            System.out.print("NIPDN: ");
            String nipdn = sc29.next();
            sc29.nextLine();
            System.out.print("Kelas yang Diajar: ");
            String kelasDiajar = sc29.nextLine();
            System.out.print("Mata Kuliah yang Diampu: ");
            String mataKuliahDiampu = sc29.nextLine();

            dosenArray[i] = new Dosen29(namaDosen, nipdn, kelasDiajar, mataKuliahDiampu);
            System.out.println();
        }

        System.out.println("Data Dosen:");
        for (int i = 0; i < jumlahDosen; i++) {
            dosenArray[i].cetakInfo();
        }
        sc29.close();
    }
}