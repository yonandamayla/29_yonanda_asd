import java.util.Scanner;

public class MainPangkat29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc29.nextInt();

        Pangkat29[] png = new Pangkat29[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = sc29.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = sc29.nextInt();
            png[i] = new Pangkat29(nilai, pangkat);
        }

        System.out.println("===========================================================");
        System.out.println("Pilih method yang ingin dijalankan:");
        System.out.println("1. Pangkat dengan Brute Force");
        System.out.println("2. Pangkat dengan Divide and Conquer");
        System.out.print("Masukkan pilihan Anda (1/2) : ");
        int pilihan = sc29.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("===========================================================");
                System.out.println("Hasil pangkat dengan brute force : ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("===========================================================");
                System.out.println("Hasil pangkat dengan divide conquer : ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
