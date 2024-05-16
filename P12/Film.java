public class Film {
    int id;
    String judul;
    double rating;
    Film next, prev;

    public Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = this.prev = null;
    }
}
