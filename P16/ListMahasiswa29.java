/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa29 {
    List<Mahasiswa29> mahasiswas = new ArrayList<>();

    public void add(Mahasiswa29... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void remove(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa29 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void display() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(" " + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    };*/

/*public static void main(String[] args) {
    ListMahasiswa29 lm = new ListMahasiswa29();
    Mahasiswa29 m = new Mahasiswa29("201234", "Noureen", "021xx1");
    Mahasiswa29 m1 = new Mahasiswa29("201235", "AkhLeema", "021xx2");
    Mahasiswa29 m2 = new Mahasiswa29("201236", "Shannum", "021xx3");

    // menambahkan objek mahasiswa
    lm.add(m, m1, m2);
    // menampilkan list mahasiswa
    lm.display();
    // update mahasiswa
    lm.update(lm.binarySearch("201235"), new Mahasiswa29("201235", "AkhLeema Lela", "021xx2"));
    System.out.println("");
    lm.display();
}*/

// modifikasi linearSearch menjadi binarySearch

import java.util.*;

public class ListMahasiswa29 {
    List<Mahasiswa29> mahasiswas = new ArrayList<>();

    public void add(Mahasiswa29... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void remove(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa29 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void display() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(" " + mhs.toString());
        });
    }

    int binarySearch(String nim) {
        Comparator<Mahasiswa29> comparator = Comparator.comparing(Mahasiswa29::getNim);
        Collections.sort(mahasiswas, comparator);
        return Collections.binarySearch(mahasiswas, new Mahasiswa29(nim, "", ""), comparator);
    }

    public void sortAscending() {
        Comparator<Mahasiswa29> comparator = Comparator.comparing(Mahasiswa29::getNim);
        Collections.sort(mahasiswas, comparator);
    }

    public void sortDescending() {
        Comparator<Mahasiswa29> comparator = Comparator.comparing(Mahasiswa29::getNim).reversed();
        Collections.sort(mahasiswas, comparator);
    }

    public static void main(String[] args) {
        ListMahasiswa29 lm = new ListMahasiswa29();
        Mahasiswa29 m = new Mahasiswa29("201234", "Noureen", "021xx1");
        Mahasiswa29 m1 = new Mahasiswa29("201235", "AkhLeema", "021xx2");
        Mahasiswa29 m2 = new Mahasiswa29("201236", "Shannum", "021xx3");

        lm.add(m, m1, m2);
        lm.display();
        int index = lm.binarySearch("201235");
        if (index >= 0) {
            lm.update(index, new Mahasiswa29("201235", "AkhLeema Lela", "021xx2"));
        }
        System.out.println("");
        lm.display();
        // sort ascending
        lm.sortAscending();
        System.out.println();
        System.out.println("After sorting ascending:");
        lm.display();
        // sort descending
        lm.sortDescending();
        System.out.println();
        System.out.println("After sorting descending:");
        lm.display();
    }
}
