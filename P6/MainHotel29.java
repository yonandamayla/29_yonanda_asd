public class MainHotel29 {
    public static void main(String[] args) {
        HotelService29 service = new HotelService29(5);

        // menambahkan beberapa hotel :
        service.tambah(new Hotel29("Melati", "Jombang", 500000, (byte) 3));
        service.tambah(new Hotel29("Fatma", "Jombang", 1000000, (byte) 4));
        service.tambah(new Hotel29("Mawar", "Surabaya", 700000, (byte) 3));
        service.tambah(new Hotel29("Yusro", "Malang", 2000000, (byte) 5));
        service.tambah(new Hotel29("Cakra", "Jombang", 300000, (byte) 2));

        // menampilkan semua hotel sebelum diurutkan :
        System.out.println("Daftar hotel sebelum diurutkan :");
        service.tampilAll();

        // sorting bubble sort berdasarkan harga dari terendah ke tertinggi (ascending)
        System.out.println("\nDaftar hotel berdasarkan harga dari terendah ke tertinggi (Bubble Sort) : ");
        service.bubbleSortByPriceAsc();
        service.tampilAll();

        // sorting bubble sort berdasarkan harga dari harga tertinggi ke terendah (descending)
        System.out.println("\nDaftar hotel berdasarkan harga dari tertinggi ke terendah (Bubble Sort) : ");
        service.bubbleSortByPriceDesc();
        service.tampilAll();

        // sorting selection sort berdasarkan rating bintang dari tertinggi ke terendah (descending)
        System.out.println("\nDaftar hotel berdasarkan rating bintang dari tertinggi ke terendah (Selection Sort) : ");
        service.selectionSortByRatingDesc();
        service.tampilAll();

        //sorting selection sort berdasarkan rating bintang dari terendah ke tertinggi (ascending)
        System.out.println("\nDaftar hotel berdasarkan rating bintang dari terendah ke tertinggi (Selection Sort) : ");
        service.selectionSortByRatingAsc();
        service.tampilAll();
    }
}
