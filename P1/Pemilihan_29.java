import java.util.Scanner;

public class Pemilihan_29 {

    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);

        System.out.println(" =======================================");
        System.out.println("|     Program Menghitung Nilai Akhir    |");
        System.out.println(" =======================================");

        // input nilai tugas, kuis, UTS, dan UAS
        System.out.print("Masukkan nilai tugas (0-100)  : ");
        int nilaiTugas = input29.nextInt();

        System.out.print("Masukkan nilai kuis (0-100)   : ");
        int nilaiKuis = input29.nextInt();

        System.out.print("Masukkan nilai UTS (0-100)    : ");
        int nilaiUTS = input29.nextInt();

        System.out.print("Masukkan nilai UAS (0-100)    : ");
        int nilaiUAS = input29.nextInt();

        // konversi nilai huruf
        String nilaiHuruf = " ";
        String keterangan = " ";

        // menghitung rata-rata nilai akhir
        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.3 * nilaiUAS;

        
        System.out.println("========================================");
        System.out.println("========================================");

        // output hasil
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        // mengecek kondisi setelah menghitung nilai akhir
        if (nilaiTugas >= 0 && nilaiTugas <= 100 &&
                nilaiKuis >= 0 && nilaiKuis <= 100 &&
                nilaiUTS >= 0 && nilaiUTS <= 100 &&
                nilaiUAS >= 0 && nilaiUAS <= 100) {

            // konversi nilai
            if (nilaiAkhir > 80 && nilaiAkhir <= 00) {
                nilaiHuruf = "A";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                keterangan = "TIDAK LULUS";
            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
                keterangan = "TIDAK LULUS";
            }

            // output nilai huruf dan keterangan
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Keterangan: " + keterangan);

        } else {
            System.out.println("Nilai tidak valid");
        }
        input29.close();
    }
}
