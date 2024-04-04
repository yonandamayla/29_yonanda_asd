import java.util.Scanner;

public class StackMain29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        Stack292 stk = new Stack292(5); 

        char pilih;
        do {
            System.out.println("Menu:");
            System.out.println("1. Push (Tambah data pakaian)");
            System.out.println("2. Pop (Hapus data pakaian teratas)");
            System.out.println("3. Peek (Lihat data pakaian teratas)");
            System.out.println("4. Print (Cetak semua data pakaian)");
            System.out.println("5. Keluar");

            System.out.print("Pilih operasi (1-5): ");
            int choice = sc29.nextInt();
            sc29.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Jenis : ");
                    String jenis = sc29.nextLine();
                    System.out.print("Warna : ");
                    String warna = sc29.nextLine();
                    System.out.print("Merk : ");
                    String merk = sc29.nextLine();
                    System.out.print("Ukuran : ");
                    String ukuran = sc29.nextLine();
                    System.out.print("Harga : ");
                    double harga = sc29.nextDouble();
                    sc29.nextLine(); 
                    Pakaian29 p = new Pakaian29(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    System.out.println("Data ditambahkan ke dalam stack.");
                    break;
                case 2:
                    stk.pop();
                    System.out.println("Data pakaian teratas telah dihapus.");
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }

            System.out.println("Isi stack setelah operasi:");
            stk.print();

            System.out.print("Apakah anda ingin melanjutkan (y/n)? ");
            pilih = sc29.next().charAt(0);
            sc29.nextLine(); 
        } while (pilih == 'y' || pilih == 'Y');

        sc29.close();
    }
}
