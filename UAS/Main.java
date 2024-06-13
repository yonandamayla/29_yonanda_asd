import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedList29 list = new DoubleLinkedList29();

        // Inisialisasi data dummy
        list.addVehicle(new BarangRental29("TNKB1", "Kendaraan1", "motor", 2000));
        list.addVehicle(new BarangRental29("TNKB2", "Kendaraan2", "mobil", 2001));
        list.addVehicle(new BarangRental29("TNKB3", "Kendaraan3", "motor", 2002));

        while (true) {
            System.out.println("1. Daftar kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan transaksi urut no TNKB");
            System.out.println("5. Tampilkan total pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    list.displayVehicles();
                    System.out.println("Daftar Kendaraan:");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.printf("%-10s %-15s %-10s %-10s\n", "TNKB", "Nama Kendaraan", "Jenis", "Tahun");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    list.displayVehicles();
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.print("Masukkan nama peminjam: ");
                    String name = scanner.next();
                    System.out.print("Masukkan durasi peminjaman (jam): ");
                    int duration = scanner.nextInt();
                    System.out.print("Masukkan nomor TNKB kendaraan: ");
                    String tnkb = scanner.next();
                    System.out.print("Apakah peminjam member? (y/n): ");
                    boolean isMember = scanner.next().equalsIgnoreCase("y");
                    list.handleRental(name, duration, tnkb, isMember);
                    break;
                case 3:
                    list.displayTransactions();
                    break;
                case 4:
                    list.sortTransactionsByTNKB();
                    break;
                case 5:
                    System.out.println("Total Pendapatan: Rp" + list.calculateTotalIncome());
                    break;
                case 6:
                    System.out.println("Keluar...");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
