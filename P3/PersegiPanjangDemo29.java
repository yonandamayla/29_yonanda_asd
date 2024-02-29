import java.util.Scanner;

public class PersegiPanjangDemo29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        System.out.print("Masukkan jumlah persegi panjang : ");
        int jmlPersegiPanjang = sc29.nextInt();

        PersegiPanjang29[] arrayOfPersegiPanjang29 = new PersegiPanjang29[jmlPersegiPanjang];

        for (int i = 0; i < jmlPersegiPanjang; i++) {
            System.out.println("Persegi panjang ke - " + (i + 1));
            sc29.nextLine();
            System.out.print("Masukkan panjang : ");
            int panjang = sc29.nextInt();
            System.out.print("Masukkan lebar : ");
            int lebar = sc29.nextInt();
            arrayOfPersegiPanjang29[i] = new PersegiPanjang29(panjang, lebar);
            System.out.println();
        }

        for (int i = 0; i < jmlPersegiPanjang; i++) {
            arrayOfPersegiPanjang29[i].cetakInfo();
            System.out.println("Persegi panjang ke - " + (i + 1) + ". panjang : " + arrayOfPersegiPanjang29[i].panjang
                    + ", lebar : " + arrayOfPersegiPanjang29[i].lebar + ", luas : "
                    + arrayOfPersegiPanjang29[i].hitungLuas() + ", keliling : "
                    + arrayOfPersegiPanjang29[i].hitungKeliling());
        }
        sc29.close();
    }
}
