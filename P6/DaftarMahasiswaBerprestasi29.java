public class DaftarMahasiswaBerprestasi29 {
    Mahasiswa29 listMhs[] = new Mahasiswa29[5];
    int idx;

    // method tambah untuk menambahkan objek dari class Mahasiswa29 ke dalam atribut listMhs
    void tambah(Mahasiswa29 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    // method tampil untuk menampilkan semua data mahasiswa2 yg ada di dalam class dataMahasiswaBerprestasi29
    void tampil() {
        for (Mahasiswa29 m : listMhs) {
            m.tampil();
            System.out.println("===========================");
        }
    }

    // method bubblesort
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    // di bawah ini proses swap atau penukaran
                    Mahasiswa29 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    // method selection sort
    void selectionSort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // swap
            Mahasiswa29  tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // method insertion sort
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa29 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) { 
                // Menrubah kondisi untuk descending sort
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
