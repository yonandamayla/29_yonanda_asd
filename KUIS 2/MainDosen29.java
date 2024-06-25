import java.util.Scanner;

public class MainDosen29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList29 list = new LinkedList29();

        list.addMahasiswa(new Mahasiswa29("Yonanda", 90, "SIB-1H", "NIM001"));
        list.addMahasiswa(new Mahasiswa29("Lavina", 85, "SIB-1H", "NIM002"));
        list.addMahasiswa(new Mahasiswa29("Reva", 88, "SIB-1H", "NIM003"));
        list.addMahasiswa(new Mahasiswa29("Fikri", 92, "SIB-1H", "NIM004"));
        list.addMahasiswa(new Mahasiswa29("Khalid", 75, "SIB-1H", "NIM005"));

        list.printMahasiswa();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Tampilkan Semua Mahasiswa");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai (Tertinggi ke Terendah)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Nilai: ");
                    int nilai = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("NIM: ");
                    String NIM = scanner.nextLine();
                    list.addMahasiswa(new Mahasiswa29(nama, nilai, kelas, NIM));
                    break;
                case 2:
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                    String nimToDelete = scanner.nextLine();
                    list.deleteMahasiswa(nimToDelete);
                    break;
                case 3:
                    list.printMahasiswa();
                    break;
                case 4:
                    list.sortMahasiswa();
                    System.out.println("Mahasiswa telah diurutkan berdasarkan nilai dari tertinggi ke terendah.");
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close(); 
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}