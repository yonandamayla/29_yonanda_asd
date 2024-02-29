import java.util.Scanner;

public class RuanganMain29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        System.out.print("Masukkan jumlah ruangan : ");
        int jmlRuangan = sc29.nextInt();
        sc29.nextLine();

        Ruangan29[] ruanganArray = new Ruangan29[jmlRuangan];

        for (int i = 0; i < jmlRuangan; i++) {
            System.out.println("Masukkan data ruangan ke- " + (i + 1));
            System.out.print("Masukkan Nama Ruangan : ");
            String namaRuangan = sc29.nextLine();
            System.out.print("Masukkan kapasitas : ");
            int kapasitas = sc29.nextInt();
            sc29.nextLine();
            System.out.print("Masukkan fasilitas : ");
            String fasilitas = sc29.nextLine();

            ruanganArray[i] = new Ruangan29(namaRuangan, kapasitas, fasilitas);
            System.out.println();
        }
        for (int i = 0; i < ruanganArray.length; i++) {
            System.out.print("Ruangan ke - " + (i + 1));
            ruanganArray[i].cetakInfo();
        }
        sc29.close();
    }
}
