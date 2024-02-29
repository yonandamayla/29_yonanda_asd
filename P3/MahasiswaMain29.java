import java.util.Scanner;

public class MahasiswaMain29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMahasiswa = sc29.nextInt();

        Mahasiswa29[] mahasiswaArray = new Mahasiswa29[jmlMahasiswa];

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke - " + (i + 1));
            sc29.nextLine();
            System.out.print("Nama : ");
            String nama = sc29.nextLine();
            System.out.print("Masukkan nim : ");
            int nim = sc29.nextInt();
            sc29.nextLine();
            System.out.print("Masukkan jenis kelamin (P / L): ");
            char jk = sc29.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            double ipk = sc29.nextDouble();

            mahasiswaArray[i] = new Mahasiswa29(nama, nim, jk, ipk);
            System.out.println();
        }

        for (Mahasiswa29 mahasiswa29 : mahasiswaArray) {
            mahasiswa29.cetakInfo();
        }

        double totalIpk = 0;
        for (Mahasiswa29 mahasiswa29 : mahasiswaArray) {
            totalIpk += mahasiswa29.getIpk();
        }

        double rataIpk = totalIpk / mahasiswaArray.length;

        System.out.println("\nRata-rata IPK Mahasiswa : " + rataIpk);

        sc29.close();
    }
}
