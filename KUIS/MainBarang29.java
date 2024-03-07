import java.util.Scanner;

public class MainBarang29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        // Menginisialisasi data barang
        Barang29 barang1 = new Barang29("Bedak", "B01", 50000, 5);
        Barang29 barang2 = new Barang29("Sunscreen", "S01", 40000, 10);
        Barang29 barang3 = new Barang29("Sunscreen Tone Up", "S02", 50000, 8);
        Barang29 barang4 = new Barang29("Moisturizer gel", "M01", 70000, 20);
        Barang29 barang5 = new Barang29("Toner", "T01", 35000, 15);

        // Menginstansiasi transaksi 
        TransaksiBarang29 transaksi = new TransaksiBarang29(3);

        // Menambahkan barang ke transaksi
        transaksi.tambahPembelian(barang1);
        transaksi.tambahPembelian(barang2);
        transaksi.tambahPembelian(barang3);
        transaksi.tambahPembelian(barang4);
        transaksi.tambahPembelian(barang5);

        int pilihan;

        do {
            //menampilkan pemilihan menu
            System.out.println("=====================");
            System.out.println("YONANDA ONLINE STORE");
            System.out.println("=====================");
            System.out.println("Menu:");
            System.out.println("|1| Tampilkan Daftar Barang");
            System.out.println("|2| Beli Barang");
            System.out.println("|3| Tampilkan Pembelian");
            System.out.println("|4| Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc29.nextInt();

            switch (pilihan) {
                case 1:
                    // menampilkan daftar barang
                    tampilkanDaftarBarang(barang1, barang2, barang3, barang4, barang5);
                    break;
                case 2:
                    // melakukan pembelian barang 
                    beliBarang(transaksi, sc29);
                    break;
                case 3:
                    // menampilkan daftar pembelian 
                    transaksi.tampilkanBarangPembelian();
                    break;
                case 4:
                    // keluar dari program
                    System.out.println("Terima kasih telah berbelanja di toko kami :)");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih kembali.");
            }
        } while (pilihan != 4);

        sc29.close();
    }

    // Metode untuk menampilkan daftar barang
    public static void tampilkanDaftarBarang(Barang29... barang) {
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("| %-20s | %-5s | %-10s | %-5s |\n", "Nama Barang", "Kode", "Harga", "Stok");
        System.out.println("-------------------------------------------------------------------");
        
        for (Barang29 b : barang) {
            b.cetakInfo();
        }
        
        System.out.println("-------------------------------------------------------------------");
    }

    // Method untuk melakukan pembelian
    public static void beliBarang(TransaksiBarang29 transaksi, Scanner scanner) {
        System.out.print("Masukkan kode barang yang ingin dibeli: ");
        String kodeBarang = scanner.next();
        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        int jumlahBarang = scanner.nextInt();

        transaksi.melakukanPembelian(kodeBarang, jumlahBarang);
    }
}
