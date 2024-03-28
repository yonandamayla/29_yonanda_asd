import java.util.ArrayList;
import java.util.Scanner;

public class MainMahasiswa29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = s.nextInt();

        PencarianMhs29 data = new PencarianMhs29(jumMhs);

        System.out.println("========================================================");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil : ");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("========================================================");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa29 m = new Mahasiswa29(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("=====================================");
        System.out.println("Data keseluruhan mahasiswa : ");
        data.tampil();

        System.out.println("-------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama mahasiswa yang dicari : ");
        System.out.print("Nama: ");
        String cariNama = sl.nextLine();
        System.out.println("Menggunakan Binary Search");
        ArrayList<Integer> posisi = data.FindBinarySearch(cariNama);

        if (posisi.isEmpty()) {
            System.out.println("Data dengan nama " + cariNama + " tidak ditemukan");
        } else if (posisi.size() == 1) {
            int pos = posisi.get(0);
            data.TampilPosisi(cariNama, pos);
            data.TampilData(cariNama, pos);
        } else {
            System.out.println("Pencarian menghasilkan lebih dari satu hasil:");
            for (int pos : posisi) {
                data.TampilPosisi(cariNama, pos);
                data.TampilData(cariNama, pos);
                System.out.println();
            }
        }
    }
}

class PencarianMhs29 {
    ArrayList<Mahasiswa29> listMhs;

    public PencarianMhs29(int size) {
        listMhs = new ArrayList<>(size);
    }

    void tambah(Mahasiswa29 m) {
        listMhs.add(m);
    }

    void tampil() {
        for (Mahasiswa29 m : listMhs) {
            m.tampil();
            System.out.println("==========================");
        }
    }

    public ArrayList<Integer> FindBinarySearch(String cari) {
        ArrayList<Integer> posisi = new ArrayList<>();
        int left = 0;
        int right = listMhs.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = listMhs.get(mid).nama.compareToIgnoreCase(cari);

            if (cmp == 0) {
                posisi.add(mid);
                // Cek ke kiri dari posisi tengah
                int kiri = mid - 1;
                while (kiri >= 0 && listMhs.get(kiri).nama.equalsIgnoreCase(cari)) {
                    posisi.add(kiri);
                    kiri--;
                }
                // Cek ke kanan dari posisi tengah
                int kanan = mid + 1;
                while (kanan < listMhs.size() && listMhs.get(kanan).nama.equalsIgnoreCase(cari)) {
                    posisi.add(kanan);
                    kanan++;
                }
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return posisi;
    }

    public void TampilPosisi(String x, int pos) {
        System.out.println("Data dengan nama " + x + " ditemukan pada indeks : " + pos);
    }

    public void TampilData(String x, int pos) {
        System.out.println("Nim\t : " + listMhs.get(pos).nim);
        System.out.println("Nama\t : " + listMhs.get(pos).nama);
        System.out.println("Umur\t : " + listMhs.get(pos).umur);
        System.out.println("IPK\t : " + listMhs.get(pos).ipk);
    }
}

class Mahasiswa29 {
    int nim;
    String nama;
    int umur;
    double ipk;

    public Mahasiswa29(int nim, String nama, int umur, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println("Nim\t : " + nim);
        System.out.println("Nama\t : " + nama);
        System.out.println("Umur\t : " + umur);
        System.out.println("IPK\t : " + ipk);
    }
}
