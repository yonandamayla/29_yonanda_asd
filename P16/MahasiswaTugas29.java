import java.util.*;

class Mahasiswa {
    String nim;
    String nama;
    String telfon;

    Mahasiswa(String nim, String nama, String telfon) {
        this.nim = nim;
        this.nama = nama;
        this.telfon = telfon;
    }

    String getNim() {
        return nim;
    }

    String getNama() {
        return nama;
    }

    String getTelfon() {
        return telfon;
    }
}

class MataKuliah {
    String kode;
    String nama;
    int sks;

    MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    String getKode() {
        return kode;
    }

    String getNama() {
        return nama;
    }

    int getSks() {
        return sks;
    }
}

class Nilai {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilai;

    Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    double getNilai() {
        return nilai;
    }
}

public class MahasiswaTugas29 {
    static List<Nilai> daftarNilai = new ArrayList<>();
    static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    static List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        String nim;
        do {
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println(
                    "1. Input Nilai\n2. Tampil Nilai\n3. Mencari Nilai Mahasiswa\n4. Urut Data Nilai\n5. Keluar\n6. Hapus Data Mahasiswa");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    inputNilai();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("***********************************************");
                    System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
                    System.out.println("***********************************************");

                    System.out.printf("%-10s %-15s %-15s %-20s %-5s %-5s\n", "NIM", "Nama", "Telfon", "Mata Kuliah",
                            "SKS", "Nilai");
                    for (Nilai n : daftarNilai) {
                        System.out.printf("%-10s %-15s %-15s %-20s %-5d %-5.2f\n",
                                n.getMahasiswa().getNim(),
                                n.getMahasiswa().getNama(),
                                n.getMahasiswa().getTelfon(),
                                n.getMataKuliah().getNama(),
                                n.getMataKuliah().getSks(),
                                n.getNilai());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    nim = scanner.next();
                    int totalSks = 0;
                    System.out.printf("%-10s %-15s %-15s %-20s %-5s %-5s\n", "NIM", "Nama", "Telfon", "Mata Kuliah",
                            "SKS", "Nilai");
                    for (Nilai n : daftarNilai) {
                        if (n.getMahasiswa().getNim().equals(nim)) {
                            System.out.printf("%-10s %-15s %-15s %-20s %-5d %-5.2f\n",
                                    n.getMahasiswa().getNim(),
                                    n.getMahasiswa().getNama(),
                                    n.getMahasiswa().getTelfon(),
                                    n.getMataKuliah().getNama(),
                                    n.getMataKuliah().getSks(),
                                    n.getNilai());
                            totalSks += n.getMataKuliah().getSks();
                        }
                    }
                    System.out.println();
                    System.out.println("Total SKS " + totalSks + " yang telah diambil");
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("%-10s %-15s %-15s %-20s %-5s %-5s\n", "NIM", "Nama", "Telfon", "Mata Kuliah",
                            "SKS", "Nilai");
                    for (Nilai n : daftarNilai) {
                        System.out.printf("%-10s %-15s %-15s %-20s %-5d %-5.2f\n",
                                n.getMahasiswa().getNim(),
                                n.getMahasiswa().getNama(),
                                n.getMahasiswa().getTelfon(),
                                n.getMataKuliah().getNama(),
                                n.getMataKuliah().getSks(),
                                n.getNilai());
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Keluar");
                    System.out.println();
                    break;
                case 6:
                    hapusDataMahasiswa();
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 5);
    }

    static void inputNilai() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.next();
        System.out.print("Masukkan No Telfon: ");
        String telfon = scanner.next();
        Mahasiswa m = new Mahasiswa(nim, nama, telfon);
        daftarMahasiswa.add(m);

        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kode = scanner.next();
        System.out.print("Masukkan Nama Mata Kuliah: ");
        String namaMk = scanner.next();
        System.out.print("Masukkan SKS: ");
        int sks = scanner.nextInt();
        MataKuliah mk = new MataKuliah(kode, namaMk, sks);
        daftarMataKuliah.add(mk);

        System.out.print("Masukkan Nilai: ");
        double nilai = scanner.nextDouble();
        daftarNilai.add(new Nilai(m, mk, nilai));
    }

    static void tampilNilai() {
        for (Nilai n : daftarNilai) {
            System.out.println("NIM: " + n.getMahasiswa().getNim() + ", Nama: " + n.getMahasiswa().getNama() +
                    ", Telfon: " + n.getMahasiswa().getTelfon() + ", Mata Kuliah: " + n.getMataKuliah().getNama() +
                    ", SKS: " + n.getMataKuliah().getSks() + ", Nilai: " + n.getNilai());
        }
    }

    static void cariNilai(String nim) {
        for (Nilai n : daftarNilai) {
            if (n.getMahasiswa().getNim().equals(nim)) {
                System.out.println("NIM: " + n.getMahasiswa().getNim() + ", Nama: " + n.getMahasiswa().getNama() +
                        ", Telfon: " + n.getMahasiswa().getTelfon() + ", Mata Kuliah: " + n.getMataKuliah().getNama() +
                        ", SKS: " + n.getMataKuliah().getSks() + ", Nilai: " + n.getNilai());
            }
        }
    }

    static void urutNilai() {
        daftarNilai.sort(Comparator.comparing(Nilai::getNilai));
        tampilNilai();
    }

    static void hapusDataMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
        String nim = scanner.next();
    
        Queue<Mahasiswa> queueMahasiswa = new LinkedList<>();
        for (Mahasiswa m : daftarMahasiswa) {
            if (!m.getNim().equals(nim)) {
                queueMahasiswa.add(m);
            }
        }
    
        daftarMahasiswa.clear();
        while (!queueMahasiswa.isEmpty()) {
            daftarMahasiswa.add(queueMahasiswa.poll());
        }
    
        // Remove the Nilai objects that reference the Mahasiswa object
        daftarNilai.removeIf(n -> n.getMahasiswa().getNim().equals(nim));
    
        System.out.println("Data mahasiswa dengan NIM " + nim + " telah dihapus.");
    
        System.out.println("Data yang tersisa:");
        tampilNilai();
    }
}