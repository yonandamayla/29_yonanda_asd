import java.util.Scanner;

public class MainVaksinasi {
    public static void main(String[] args) {
        VaksinasiQueue queue = new VaksinasiQueue();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("          PENGANTRI VAKSIN EXTRAVAGANZA       ");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Menu:");
            System.out.println("1. Tambah data penerima vaksin");
            System.out.println("2. Hapus data pengantri vaksin");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("         MASUKKAN DATA PENERIMA VAKSIN        ");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Nomor Antrian : ");
                    int nomorAntrian = sc.nextInt();
                    sc.nextLine();  
                    System.out.println("Nama penerima : ");
                    String nama = sc.nextLine();
                    queue.tambahData(nomorAntrian, nama);
                    break;
                case 2:
                    queue.hapusData();
                    break;
                case 3:
                    queue.daftarPenerimaVaksin();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        sc.close();
    }
}
