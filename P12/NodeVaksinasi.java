public class NodeVaksinasi {
    int nomorAntrian;
    String nama;
    NodeVaksinasi next, prev;

    NodeVaksinasi(int nomorAntrian, String nama) {
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
        this.next = this.prev = null;
    }
}