import java.util.Scanner;

public class Perulangan_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // masukkan inputan dari user
        System.out.print("Masukkan NIM Anda (10 digit) : ");
        long nim = input.nextLong();

        // mengambil dua digit terakhir dari NIM
        int duaDigitTerakhir = (int) (nim % 100);

        // menambahkan 10 apabila 2 bilangan digit terakhir <10
        if (duaDigitTerakhir < 10) {
            duaDigitTerakhir += 10;
        }

        // Tmenampilkan deretan bilangan dari 1 sampai duaDigitTerakhir (kecuali 6 dan 10)
        for (int i = 1; i <= duaDigitTerakhir; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
        input.close();
    }
}
