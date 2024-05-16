public class FilmList {
    private Film head, tail;

    public FilmList() {
        head = tail = null;
    }

    public void tambahDataAwal(int id, String judul, double rating) {
        Film newFilm = new Film(id, judul, rating);
        if (head == null) {
            head = tail = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }
        System.out.println("Film berhasil ditambahkan di awal");
    }

    public void tambahDataAkhir(int id, String judul, double rating) {
        Film newFilm = new Film(id, judul, rating);
        if (tail == null) {
            head = tail = newFilm;
        } else {
            tail.next = newFilm;
            newFilm.prev = tail;
            tail = newFilm;
        }
        System.out.println("Film berhasil ditambahkan di akhir");
    }

    public void tambahDataIndeks(int id, String judul, double rating, int indeks) {
        if (indeks == 0) {
            tambahDataAwal(id, judul, rating);
            return;
        }
        Film newFilm = new Film(id, judul, rating);
        Film current = head;
        for (int i = 0; i < indeks - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            tambahDataAkhir(id, judul, rating);
        } else {
            newFilm.next = current.next;
            newFilm.prev = current;
            current.next.prev = newFilm;
            current.next = newFilm;
            System.out.println("Film berhasil ditambahkan di indeks " + indeks);
        }
    }

    public void hapusDataPertama() {
        if (head == null) {
            System.out.println("Daftar film kosong, tidak ada data yang dapat dihapus.");
            return;
        }
        System.out.println("Film dengan ID " + head.id + " berhasil dihapus.");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void hapusDataTerakhir() {
        if (tail == null) {
            System.out.println("Daftar film kosong, tidak ada data yang dapat dihapus.");
            return;
        }
        System.out.println("Film dengan ID " + tail.id + " berhasil dihapus.");
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void hapusDataTertentu(int id) {
        Film current = head;
        while (current != null && current.id != id) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Film dengan ID " + id + " tidak ditemukan");
            return;
        }
        if (current == head) {
            hapusDataPertama();
        } else if (current == tail) {
            hapusDataTerakhir();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Film dengan ID " + id + " berhasil dihapus");
        }
    }

    public void cetak() {
        if (head == null) {
            System.out.println("Daftar film kosong");
            return;
        }
        Film current = head;
        System.out.println("+----+---------------------------+--------+");
        System.out.println("| ID | Judul                     | Rating |");
        System.out.println("+----+---------------------------+--------+");
        while (current != null) {
            System.out.printf("| %-2d | %-25s | %-6.2f |\n", current.id, current.judul, current.rating);
            current = current.next;
        }
        System.out.println("+----+---------------------------+--------+");
    }

    public void cariIDFilm(int id) {
        Film current = head;
        while (current != null && current.id != id) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        } else {
            System.out.println("Film ditemukan: ID = " + current.id + ", Judul = " + current.judul + ", Rating = " + current.rating);
        }
    }

    public void urutDataRatingDescending() {
        if (head == null) {
            System.out.println("Daftar film kosong.");
            return;
        }
        // Bubble sort
        boolean swapped;
        do {
            swapped = false;
            Film current = head;
            while (current.next != null) {
                if (current.rating < current.next.rating) {
                    // Swap data
                    int tempId = current.id;
                    String tempJudul = current.judul;
                    double tempRating = current.rating;

                    current.id = current.next.id;
                    current.judul = current.next.judul;
                    current.rating = current.next.rating;

                    current.next.id = tempId;
                    current.next.judul = tempJudul;
                    current.next.rating = tempRating;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
        System.out.println("Data film berhasil diurutkan berdasarkan rating secara descending.");
    }
}
