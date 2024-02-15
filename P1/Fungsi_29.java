public class Fungsi_29 {
    public static void main(String[] args) {
        int bunga[][] = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }};
        int harga[] = { 75000, 50000, 60000, 10000 };

        System.out.println(" ==============================================================");
        System.out.println("|       Informasi Pendapatan dan Stok Bunga Royal Garden      |");
        System.out.println(" ==============================================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "RoyalGarden", "Aglonema", "Keladi", "Alocasia", "Mawar");
        pendapatan(bunga, harga);
        stock(bunga);
        pengurangan(bunga);
    }

    static void pendapatan(int bunga[][], int harga[]) {
        int totalPendapatan;

        for (int i = 0; i < bunga.length; i++) {
            totalPendapatan = 0;

            System.out.printf("%-15s", "RoyalGarden" + (i + 1));
            for (int j = 0; j < bunga[i].length; j++) {
            totalPendapatan += bunga[i][j] * harga[j];}
            System.out.printf("%-15d %-15d %-15d %-15d%n", bunga[i][0] * harga[0], bunga[i][1] * harga[1],bunga[i][2] * harga[2], bunga[i][3] * harga[3]);
        }
    }

    static void stock(int bunga[][]) {
        
        System.out.println(" ==============================================");
        System.out.println("|      Informasi Stok Bunga Royal Garden      |");
        System.out.println(" ==============================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "RoyalGarden", "Aglonema", "Keladi", "Alocasia", "Mawar");

        for (int i = 0; i < bunga.length; i++) {
            System.out.printf("%-15s", "RoyalGarden" + (i + 1));
            for (int j = 0; j < bunga[i].length; j++) {
            System.out.printf("%-15d ", bunga[i][j]);
            }
            System.out.println();
        }
    }

    static void pengurangan(int bunga[][]) {
        System.out.println(" =========================================================================");
        System.out.println("|      Informasi Pengurangan Stok Bunga dan Stok Akhir Royal Garden      |");
        System.out.println(" =========================================================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "RoyalGarden", "Aglonema", "Keladi", "Alocasia", "Mawar");

        for (int i = 0; i < bunga.length; i++) {
            System.out.printf("%-15s", "RoyalGarden" + (i + 1));

            for (int j = 0; j < bunga[i].length; j++) {
                if (i == 3 && j == 0) {
                    bunga[i][j] -= 1; // Pengurangan stok hanya pada Royal Garden 4 untuk Aglonema
                } else if (i == 3 && j == 1) {
                    bunga[i][j] -= 2; // Pengurangan stok hanya pada Royal Garden 4 untuk Keladi
                } else if (i == 3 && j == 3) {
                    bunga[i][j] -= 5; // Pengurangan stok hanya pada Royal Garden 4 untuk Mawar
                }
                System.out.printf("%-15d ", bunga[i][j]);
            }
            System.out.println();
        }
    }
}
