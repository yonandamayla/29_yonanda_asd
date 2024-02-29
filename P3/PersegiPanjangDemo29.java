import java.util.Scanner;

public class PersegiPanjangDemo29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        PersegiPanjang29[] arrayOfPersegiPanjang29 = new PersegiPanjang29[3];

        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang29[i] = new PersegiPanjang29();
            System.out.println("Persegi panjang ke - " + (i + 1));
            System.out.print("Masukkan panjang : ");
            arrayOfPersegiPanjang29[i].panjang = sc29.nextInt();
            System.out.print("Masukkan lebar : ");
            arrayOfPersegiPanjang29[i].lebar = sc29.nextInt();
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang29[i].cetakInfo();
        }
    }
}
