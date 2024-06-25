class LinkedList29 {
    Node head;

    class Node {
        Mahasiswa29 data;
        Node next;

        Node(Mahasiswa29 data) {
            this.data = data;
            this.next = null;
        }
    }

    void addMahasiswa(Mahasiswa29 mahasiswa) {
        Node newNode = new Node(mahasiswa);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void deleteMahasiswa(String NIM) {
        if (head == null) return;
        if (head.data.NIM.equals(NIM)) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.NIM.equals(NIM)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    void sortMahasiswa() {
        if (head == null || head.next == null) return;
        Node current = head;
        Node index = null;
        Mahasiswa29 temp;
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data.nilai < index.data.nilai) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    void printMahasiswa() {
        Node temp = head;
        int namaWidth = 20;
        int nilaiWidth = 5;
        int kelasWidth = 10;
        int nimWidth = 10;
    
        System.out.println(
            String.format("%-" + namaWidth + "s %-" + nilaiWidth + "s %-" + kelasWidth + "s %-" + nimWidth + "s", 
                        "Nama", "Nilai", "Kelas", "NIM"));
        System.out.println(
            String.format("%-" + (namaWidth + nilaiWidth + kelasWidth + nimWidth + 3) + "s", 
                        "").replace(' ', '-'));
    
        while (temp != null) {
            System.out.println(
                String.format("%-" + namaWidth + "s %-" + nilaiWidth + "s %-" + kelasWidth + "s %-" + nimWidth + "s", 
                            temp.data.nama, temp.data.nilai, temp.data.kelas, temp.data.NIM));
            temp = temp.next;
        }
    }

}