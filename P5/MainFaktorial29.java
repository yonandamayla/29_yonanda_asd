import java.util.Scanner;

public class MainFaktorial29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc29.nextInt();

        Faktorial29[] fk = new Faktorial29[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial29();
            System.out.print("Masukkan nilai data ke-" + (i +1) + " : " );
            fk[i].nilai = sc29.nextInt();
        }

        System.out.println("===========================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("===========================================");
        System.out.println("Hasil Faktorial dengan Divide Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("===========================================");
    }
}
