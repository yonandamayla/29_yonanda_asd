import java.util.Scanner;

public class MainFilm {
    public static void main(String[] args) {
        FilmList filmList = new FilmList();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=====================================================");
            System.out.println("                DATA FILM LAYAR LEBAR                ");
            System.out.println("=====================================================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data indeks tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID film");
            System.out.println("9. Urut data rating film-DESC");
            System.out.println("10. Keluar");
            System.out.println("=====================================================");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID film : ");
                    int idAwal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Judul film : ");
                    String judulAwal = scanner.nextLine();
                    System.out.println("Rating film ");
                    double ratingAwal = scanner.nextDouble();
                    filmList.tambahDataAwal(idAwal, judulAwal, ratingAwal);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("ID film : ");
                    int idAkhir = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Judul film : ");
                    String judulAkhir = scanner.nextLine();
                    System.out.println("Rating film ");
                    double ratingAkhir = scanner.nextDouble();
                    filmList.tambahDataAkhir(idAkhir, judulAkhir, ratingAkhir);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film Urutan ke-");
                    System.out.println("ID film : ");
                    int idIndeks = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Judul film : ");
                    String judulIndeks = scanner.nextLine();
                    System.out.println("Rating film ");
                    double ratingIndeks = scanner.nextDouble();
                    System.out.println("Data Film ini akan masul di urutan ke-: ");
                    int indeks = scanner.nextInt();
                    filmList.tambahDataIndeks(idIndeks, judulIndeks, ratingIndeks, indeks);
                    break;
                case 4:
                    filmList.hapusDataPertama();
                    break;
                case 5:
                    filmList.hapusDataTerakhir();
                    break;
                case 6:
                    System.out.println("ID film : ");
                    int idHapus = scanner.nextInt();
                    filmList.hapusDataTertentu(idHapus);
                    break;
                case 7:
                    filmList.cetak();
                    break;
                case 8:
                    System.out.println("Masukkan ID film yang ingin dicari: ");
                    int idCari = scanner.nextInt();
                    filmList.cariIDFilm(idCari);
                    break;
                case 9:
                    filmList.urutDataRatingDescending();
                    break;
                case 10:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
            }
        } while (pilihan != 10);
        scanner.close();
    }
}
