public class Akar29 {
    public static double squareRootBF(double bilangan) {
        double akar = 0;
        while (akar * akar <= bilangan) {
            akar += 0.0001; // Melakukan iterasi dengan langkah kecil
        }
        return Math.floor(akar * 1000) / 1000; // Membulatkan ke bawah ke tiga angka desimal
    }

    public static double squareRootDC(double bilangan) {
        return squareRootDCRecursive(bilangan, 0, bilangan);
    }

    private static double squareRootDCRecursive(double bilangan, double awal, double akhir) {
        double epsilon = 0.0001; // Nilai toleransi untuk ketepatan akar
        double tengah = (awal + akhir) / 2;

        // Jika perbedaan antara akar^2 dan bilangan kurang dari epsilon, akar ditemukan
        if (Math.abs(tengah * tengah - bilangan) <= epsilon) {
            return Math.floor(tengah * 1000) / 1000; // Membulatkan ke bawah ke tiga angka desimal
        }

        // Jika akar^2 kurang dari bilangan, cari di sebelah kanan
        if (tengah * tengah < bilangan) {
            return squareRootDCRecursive(bilangan, tengah, akhir);
        }
        // Jika akar^2 lebih dari bilangan, cari di sebelah kiri
        else {
            return squareRootDCRecursive(bilangan, awal, tengah);
        }
    }
}
