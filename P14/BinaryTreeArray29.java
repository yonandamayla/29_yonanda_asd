public class BinaryTreeArray29 {
    int[] data;
    int idxLast;

    // public BinaryTreeArray29(int size) {
    //     data = new int[10];
    // }

    // void populateData(int[] data, int idxLast) {
    //     this.data = data;
    //     this.idxLast = idxLast;
    // }

    // void traverseInorder(int idxStart) {
    //     if (idxStart <= idxLast) {
    //         traverseInorder(2 * idxStart + 1);
    //         System.out.print(data[idxStart] + " ");
    //         traverseInorder(2 * idxStart + 2);
    //     }
    // }

    // no 5 tugas modif 
    public BinaryTreeArray29(int size) {
        data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = 0;
        }
    }

    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void add(int newData) {
        if (data[0] == 0) {
            data[0] = newData;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == 0) {
                    data[i] = newData;
                    break;
                }
            }
        }
        idxLast++;
    }

    void traversePreOrder(int idxCurrent) {
        if (idxCurrent <= idxLast) {
            System.out.print(data[idxCurrent] + " ");
            traversePreOrder(2 * idxCurrent + 1);
            traversePreOrder(2 * idxCurrent + 2);
        }
    }

    void traversePostOrder(int idxCurrent) {
        if (idxCurrent <= idxLast) {
            traversePostOrder(2 * idxCurrent + 1);
            traversePostOrder(2 * idxCurrent + 2);
            System.out.print(data[idxCurrent] + " ");
        }
    }

    void traverseInorder(int idxStart) {
            if (idxStart <= idxLast) {
                traverseInorder(2 * idxStart + 1);
                System.out.print(data[idxStart] + " ");
                traverseInorder(2 * idxStart + 2);
            }
        }

    void addRecursive(int idxCurrent, int value) { //no 1 tugas
        // Jika indeks saat ini lebih besar dari idxLast, berarti kita telah mencapai akhir array
        if (idxCurrent > idxLast) {
            System.out.println("Array is full, cannot add more nodes");
            return;
        }
    
        // Jika data pada indeks saat ini adalah 0 (yang berarti node ini kosong),
        // tambahkan nilai ke node ini
        if (data[idxCurrent] == 0) {
            data[idxCurrent] = value;
            // Jika kita menambahkan node baru, perbarui idxLast
            if (idxCurrent > idxLast) {
                idxLast = idxCurrent;
            }
        } else {
            // Jika node ini sudah memiliki nilai, lanjutkan ke node berikutnya
            // Jika nilai yang akan ditambahkan lebih kecil, pergi ke anak kiri (2*idxCurrent + 1)
            // Jika nilai yang akan ditambahkan lebih besar, pergi ke anak kanan (2*idxCurrent + 2)
            if (value < data[idxCurrent]) {
                addRecursive(2 * idxCurrent + 1, value);
            } else if (value > data[idxCurrent]) {
                addRecursive(2 * idxCurrent + 2, value);
            }
        }
    }

    int findMin(int idxCurrent) {//no 2 tugas
        // Jika node saat ini kosong atau kita telah mencapai akhir array, akan mengembalikan nilai maksimum int
        if (idxCurrent > idxLast || data[idxCurrent] == 0) {
            return Integer.MAX_VALUE;
        }
    
        // Jika node saat ini memiliki left child, lanjutkan mencari di subtree kiri
        if (2 * idxCurrent + 1 <= idxLast && data[2 * idxCurrent + 1] != 0) {
            return findMin(2 * idxCurrent + 1);
        }
    
        // Jika kita mencapai sini, berarti node saat ini adalah node paling kiri
        return data[idxCurrent];
    }
    
    int findMax(int idxCurrent) {
        // Jika node saat ini kosong atau kita telah mencapai akhir array, akan mengembalikan nilai minimum int
        if (idxCurrent > idxLast || data[idxCurrent] == 0) {
            return Integer.MIN_VALUE;
        }
    
        // Jika node saat ini memiliki right child, lanjutkan mencari di subtree kanan
        if (2 * idxCurrent + 2 <= idxLast && data[2 * idxCurrent + 2] != 0) {
            return findMax(2 * idxCurrent + 2);
        }
    
        // Jika kita mencapai sini, berarti node saat ini adalah node paling kanan
        return data[idxCurrent];
    }

    void printLeaves(int idxCurrent) {//no 3 tugas
        // Jika node saat ini kosong atau kita telah mencapai akhir array
        if (idxCurrent > idxLast || data[idxCurrent] == 0) {
            return;
        }
    
        // Jika node saat ini tidak memiliki child, print nilainya
        if ((2 * idxCurrent + 1 > idxLast || data[2 * idxCurrent + 1] == 0) &&
            (2 * idxCurrent + 2 > idxLast || data[2 * idxCurrent + 2] == 0)) {
            System.out.print(data[idxCurrent] + " ");
        } else {
            // Jika node saat ini memiliki child, lanjutkan penjelajahan ke seluruh childnya
            printLeaves(2 * idxCurrent + 1);
            printLeaves(2 * idxCurrent + 2);
        }
    }

    int countLeaves(int idxCurrent) {// no 4 tugas
        // Jika node saat ini kosong atau kita telah mencapai akhir array, return 0
        if (idxCurrent > idxLast || data[idxCurrent] == 0) {
            return 0;
        }
    
        // Jika node saat ini tidak memiliki child, return 1
        if ((2 * idxCurrent + 1 > idxLast || data[2 * idxCurrent + 1] == 0) &&
            (2 * idxCurrent + 2 > idxLast || data[2 * idxCurrent + 2] == 0)) {
            return 1;
        } else {
            // Jika node saat ini memiliki child, lanjutkan penjelajahan ke seluruh childnya
            return countLeaves(2 * idxCurrent + 1) + countLeaves(2 * idxCurrent + 2);
        }
    }
}


