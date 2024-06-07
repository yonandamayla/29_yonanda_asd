import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class contohList29 {
    public static void main(String[] args) {
        /*
         * List l = new ArrayList();
         * l.add(1);
         * l.add(2);
         * l.add(3);
         * l.add("Cireng");
         * System.out.printf("Elemen 0: %d total elemen : %d elemen terakhir : %s\n",
         * l.get(0), l.size(), l.get(l.size()-1));
         * 
         * l.add(4);
         * l.remove(0);
         * System.out.printf("Elemen 0: %d total elemen : %d elemen terakhir : %s\n",
         * l.get(0), l.size(), l.get(l.size()-1));
         */

        // hasil modifikasi soal no 1
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        // l.add("Cireng"); // Line ini dapat menyebabkan compile error karena typenya string bukan int
        System.out.printf("Elemen 0: %d total elemen : %d elemen terakhir : %d\n", l.get(0), l.size(),l.get(l.size() - 1));

        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen : %d elemen terakhir : %d\n", l.get(0), l.size(),l.get(l.size() - 1));

        // Tambahkan kode program untuk menggunakan collection dengan aturan penulisan kode
        /*List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("AkhLeema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");*/

        // hasil modifikasi no 3 
        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("AkhLeema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        names.push("Mei - mei");
        System.out.printf("Elemen 0: %s total elemen : %s elemen", names.getFirst(), names.size(), names.getLast());
        System.out.printf("Elemen 0: %s total elemen : %s elemen terakhir : %s\n", names.get(0), names.size(),names.get(names.size() - 1));
        names.set(0, "My kid");
        System.out.printf("Elemen 0: %s total elemen : %s elemen terakhir : %s\n", names.get(0), names.size(),names.get(names.size() - 1));
        System.out.println("Names : " + names.toString());
    }
}
