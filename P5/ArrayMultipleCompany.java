import java.util.Scanner;

public class ArrayMultipleCompany {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc29.nextInt();

        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = sc29.nextInt();

        double[][] keuntunganPerusahaan = new double[jumlahPerusahaan][jumlahBulan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Masukkan keuntungan bulanan untuk perusahaan " + (i + 1) + ":");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Bulan " + (j + 1) + ": ");
                keuntunganPerusahaan[i][j] = sc29.nextDouble();
            }
        }

        System.out.println("Keuntungan perusahaan:");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            double totalKeuntunganPerusahaan = 0;
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.println("Perusahaan " + (i + 1) + ", Bulan " + (j + 1) + ": " + keuntunganPerusahaan[i][j]);
                totalKeuntunganPerusahaan += keuntunganPerusahaan[i][j];
            }
            System.out.println("Total keuntungan perusahaan " + (i + 1) + ": " + totalKeuntunganPerusahaan);
            System.out.println();
        }
        sc29.close();
    }
}

