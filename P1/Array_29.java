import java.util.Scanner;

public class Array_29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);

        String[] mataKuliah = { "Pancasila", "KTI", "CTPS",
                "Matematika Dasar",
                "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "K3" };
        int[] bobotSKS = { 3, 3, 3, 3, 2, 3, 2, 2 };
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];

        double totalBobotNilai = 0;
        int totalSKS = 0;

        // input nilai angka untuk setiap mata kuliah
        System.out.println(" =======================================");
        System.out.println("|     Program Menghitung Nilai Akhir    |");
        System.out.println(" =======================================");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + " : ");
            nilaiAngka[i] = input29.nextDouble();

            // Hitung nilai setara
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiAngka[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiAngka[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <=73) {
                nilaiHuruf[i] = "B";
                nilaiAngka[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiAngka[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiAngka[i] = 2.0;
            } else if (nilaiAngka[i] > 29 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiAngka[i] = 1.0;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                nilaiAngka[i] = 0.0;
            } 

            // Hitung total bobot nilai dan total SKS
            totalBobotNilai += nilaiAngka[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        // Tampilkan tabel
        System.out.println(" =======================================");
        System.out.println("|            Hasil Konversi           |:");
        System.out.println(" =======================================");
        System.out.printf("%-30s %-12s %-12s %-12s %-12s%n", "Nama Matkul", "Nilai Angka", "Nilai Huruf", "Bobot Nilai",
                "Bobot SKS");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-30s %-12.2f %-12s %-12d %-12d%n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i],
                    (int) (nilaiAngka[i] * bobotSKS[i]),
                    bobotSKS[i]);
        }

        // Hitung IP Semester
        double ipSemester = totalBobotNilai / totalSKS;

        // Output hasil
        System.out.println("\nIP Semester Anda: " + ipSemester);

        input29.close();
    }
}
