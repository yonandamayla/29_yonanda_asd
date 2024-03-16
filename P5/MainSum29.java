import java.util.Scanner;

public class MainSum29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("Program menghitung keuntungan total (Satuan juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc29.nextInt();

        Sum29 sm = new Sum29(elm);
        System.out.println("======================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke- "+(i+1) + " = ");
            sm.keuntungan[i] = sc29.nextDouble();
        }

        System.out.println("======================================");
        System.out.println("Algoritma brute force");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("======================================");
        System.out.println("Algoritma devide conquer");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));

        sc29.close();
    }
}
