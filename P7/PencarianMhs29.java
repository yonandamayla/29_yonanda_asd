public class PencarianMhs29 {
    Mahasiswa29 listMhs[];
    int idx;

    // Konstruktor untuk menentukan ukuran array listMhs
    public PencarianMhs29(int size) {
        listMhs = new Mahasiswa29[size];
        idx = 0;
    }

    public PencarianMhs29() {
        
    }

    void tambah(Mahasiswa29 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa29 m : listMhs) {
            if (m != null) {
                m.tampil();
                System.out.println("==========================");
            }
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j] != null && listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks : " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (listMhs[mid] != null && cari == listMhs[mid].nim) {
                return mid;
            } else if (listMhs[mid] != null && listMhs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
