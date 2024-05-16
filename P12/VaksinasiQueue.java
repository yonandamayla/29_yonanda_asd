public class VaksinasiQueue {
    private NodeVaksinasi head, tail;
    private int size;

    public VaksinasiQueue() {
        head = tail = null;
        size = 0;
    }

    public void tambahData(int nomorAntrian, String nama) {
        NodeVaksinasi newNode = new NodeVaksinasi(nomorAntrian, nama);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void hapusData() {
        if (head == null) {
            System.out.println("Antrian kosong, tidak ada data yang dapat dihapus.");
            return;
        }
        String nama = head.nama;
        int nomorAntrian = head.nomorAntrian;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data penerima vaksin (No. Antrian: " + nomorAntrian + ", Nama: " + nama + ") telah divaksinasi dan dihapus dari antrian");
        daftarPenerimaVaksin();
    }

    public void daftarPenerimaVaksin() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("            DAFTAR PENGANTRI VAKSIN         :");
        System.out.println("+-----------------+-------------------------+");
        System.out.println("| No. Antrian     | Nama                    |");
        System.out.println("+-----------------+-------------------------+");
        NodeVaksinasi current = head;
        while (current != null) {
            System.out.printf("| %-15d | %-23s |\n", current.nomorAntrian, current.nama);
            current = current.next;
        }
        System.out.println("+-----------------+-------------------------+");
        System.out.println("Jumlah antrian tersisa: " + size);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}
