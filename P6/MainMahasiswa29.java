import java.util.Scanner;

public class MainMahasiswa29 {
    public static void main(String[] args) {

        DaftarMahasiswaBerprestasi29 list = new DaftarMahasiswaBerprestasi29();
        Mahasiswa29 m1 = new Mahasiswa29("Kayla", 2023, 25, 3);
        Mahasiswa29 m2 = new Mahasiswa29("Reva", 2023, 19, 4);
        Mahasiswa29 m3 = new Mahasiswa29("Lavina", 2023, 19, 3.5);
        Mahasiswa29 m4 = new Mahasiswa29("Abdul", 2023, 23, 2);
        Mahasiswa29 m5 = new Mahasiswa29("Yonanda", 2023, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
