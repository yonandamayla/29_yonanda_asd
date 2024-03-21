public class HotelService29 {
    Hotel29 rooms[];

    HotelService29(int size) {
        rooms = new Hotel29[size];
    }

    void tambah(Hotel29 h) { //untuk menambahkan hotel ke dalam array
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = h;
                break;
            }
        }
    }

    void tampilAll() { // untuk menampilkan semua hotel
        for (Hotel29 room : rooms) {
            if (room != null) {
                System.out.println(" Nama : " + room.nama + ", Kota : " + room.kota + ", Harga : " + room.harga + ", Bintang : " + room.bintang);
            }
        }
    }

    void bubbleSortByPriceAsc() {//bubble sort untuk sorting berdasarkan harga terendah ke tertinggi (ascending)
        int n = rooms.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i -1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    //Swap
                    Hotel29 temp = rooms[j];
                    rooms[j] = rooms [j+1];
                    rooms[j +1] = temp;
                }
            }
        }
    }

    void bubbleSortByPriceDesc() {//bubble sort untuk sorting berdasarkan harga tertinggi ke terendah (descending)
        int n = rooms.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (rooms[j].harga < rooms[j + 1].harga) {
                    // Swap
                    Hotel29 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }
    

    void selectionSortByRatingDesc() {//selection sort untuk sorting berdasarkan bintang dari tertinggi ke terendah (descending)
        int n = rooms.length;
        for (int i = 0; i < n -1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (rooms[j].bintang > rooms[maxIdx].bintang) {
                    maxIdx = j;
                }
            }
            //swap
            Hotel29 temp = rooms[maxIdx];
            rooms[maxIdx] = rooms[i];
            rooms[i] = temp;
        }
    }

    void selectionSortByRatingAsc() {//selection sort untuk sorting berdasarkan bintang dari terendah ke tertinggi (ascending)
        int n = rooms.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (rooms[j].bintang < rooms[minIdx].bintang) {
                    minIdx = j;
                }
            }
            // Swap
            Hotel29 temp = rooms[minIdx];
            rooms[minIdx] = rooms[i];
            rooms[i] = temp;
        }
    }
    
}
