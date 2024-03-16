import java.util.Scanner;

public class MainPangkat29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc29.nextInt();

        Pangkat29[] png = new Pangkat29[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat29();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            png[i].nilai = sc29.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            png[i].pangkat = sc29.nextInt();
        }
        System.out.println("===========================================================");
        System.out.println("Hasil pangkat dengan brute force : ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("===========================================================");
        System.out.println("Hasil pangkat dengan divide conquer : ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
