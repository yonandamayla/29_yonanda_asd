import java.util.ArrayList;
import java.util.Comparator;

public class MinimarketManager29 {
    private ArrayList<Barang29> barangList = new ArrayList<>();

    public void addBarang(Barang29 barang) {
        barangList.add(barang);
    }

    public void deleteBarang(String kode) {
        barangList.removeIf(barang -> barang.getKode().equals(kode));
    }

    public void updateStok(String kode, int stok) {
        for (Barang29 barang : barangList) {
            if (barang.getKode().equals(kode)) {
                barang.setStok(stok);
                break;
            }
        }
    }

    public void sortBarang() {
        barangList.sort(Comparator.comparingDouble(Barang29::getHarga));
    }

    public void printAllBarang() {
        System.out.println("+------+----------------+----------+-------+");
        System.out.println("| Code | Name           | Price    | Stock  |");
        System.out.println("+------+----------------+----------+-------+");
        for (Barang29 barang : barangList) {
            System.out.format("| %4s | %-14s | %8.2f | %5d |\n", barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
        System.out.println("+------+----------------+----------+-------+");
    }

    public void addDummyData() {
        addBarang(new Barang29("B001", "Susu", 10000, 50));
        addBarang(new Barang29("B002", "Roti", 8500, 30));
        addBarang(new Barang29("B003", "Teh Kotak", 5000, 100));
        addBarang(new Barang29("B004", "Sabun", 15000, 20));
    }
}
