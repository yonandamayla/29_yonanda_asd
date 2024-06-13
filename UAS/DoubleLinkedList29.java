class DoubleLinkedList29 {
    private Node head;
    private Node tail;

    public DoubleLinkedList29() {
        head = null;
        tail = null;
    }

    public void addVehicle(BarangRental29 vehicle) {
        Node newNode = new Node(vehicle);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void displayVehicles() {
        Node current = head;
        while (current != null) {
            if (current.vehicle != null) {
                System.out.println("No TNKB: " + current.vehicle.getNoTNKB() + ", Nama Kendaraan: " + current.vehicle.getNamaKendaraan() + ", Jenis: " + current.vehicle.getJenisKendaraan() + ", Tahun: " + current.vehicle.getTahun() + ", Biaya Sewa: " + current.vehicle.getBiayaSewa() + ", Status: " + (current.vehicle.isRented() ? "Dipinjam" : "Tersedia"));
            }
            current = current.next;
        }
    }

    public void handleRental(String namaPeminjam, int lamaPinjam, String tnkb, boolean isMember) {
        Node current = head;
        while (current != null) {
            if (current.vehicle != null && current.vehicle.getNoTNKB().equals(tnkb)) {
                if (current.vehicle.isRented()) {
                    System.out.println("Kendaraan dengan TNKB " + tnkb + " sedang dipinjam.");
                    return;
                }
                TransaksiRental29 transaksi = new TransaksiRental29(namaPeminjam, lamaPinjam, current.vehicle, isMember);
                Node newNode = new Node(transaksi);
                if (tail == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                }
                current.vehicle.setRented(true);
                System.out.println("Transaksi berhasil!");
                System.out.println("Kode Transaksi: " + transaksi.getKodeTransaksi());
                System.out.println("Nama Peminjam: " + transaksi.getNamaPeminjam());
                System.out.println("Lama Pinjam: " + transaksi.getLamaPinjam() + " jam");
                System.out.println("Total Biaya: Rp" + transaksi.getTotalBiaya());
                System.out.println("Barang Rental: " + transaksi.getBr().getNamaKendaraan() + " (" + transaksi.getBr().getJenisKendaraan() + ")");
                return;
            }
            current = current.next;
        }
        System.out.println("Kendaraan dengan TNKB " + tnkb + " tidak ditemukan.");
    }

    public void displayTransactions() {
        Node current = head;
        while (current != null) {
            if (current.transaction != null) {
                TransaksiRental29 transaksi = current.transaction;
                System.out.println("Kode Transaksi: " + transaksi.getKodeTransaksi() + ", Nama Peminjam: " + transaksi.getNamaPeminjam() + ", Lama Pinjam: " + transaksi.getLamaPinjam() + " jam, Total Biaya: Rp" + transaksi.getTotalBiaya() + ", Barang: " + transaksi.getBr().getNamaKendaraan() + " (" + transaksi.getBr().getJenisKendaraan() + ")");
            }
            current = current.next;
        }
    }

    public void sortTransactionsByTNKB() {
        if (head == null || head.next == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node index = current.next;
            while (index != null) {
                if (current.transaction != null && index.transaction != null) {
                    if (current.transaction.getBr().getNoTNKB().compareTo(index.transaction.getBr().getNoTNKB()) > 0) {
                        TransaksiRental29 temp = current.transaction;
                        current.transaction = index.transaction;
                        index.transaction = temp;
                    }
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public double calculateTotalIncome() {
        double totalIncome = 0;
        Node current = head;
        while (current != null) {
            if (current.transaction != null) {
                totalIncome += current.transaction.getTotalBiaya();
            }
            current = current.next;
        }
        return totalIncome;
    }

    private class Node {
        BarangRental29 vehicle;
        TransaksiRental29 transaction;
        Node next;
        Node prev;

        Node(BarangRental29 vehicle) {
            this.vehicle = vehicle;
            this.transaction = null;
            this.next = null;
            this.prev = null;
        }

        Node(TransaksiRental29 transaction) {
            this.vehicle = null;
            this.transaction = transaction;
            this.next = null;
            this.prev = null;
        }
    }
}
