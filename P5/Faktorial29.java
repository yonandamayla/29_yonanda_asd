public class Faktorial29 {
    public int nilai;

    public int faktorialBF(int n) {
        long startTime = System.nanoTime();

        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = n * faktorialBF(n - 1);
            long endTime = System.nanoTime();
            System.out.println("Waktu yang diperlukan untuk faktorialBF(" + n + "): " + (endTime - startTime) + " nanodetik");
            return result;
        }
    }

    public int faktorialDC(int n) {
        long startTime = System.nanoTime();

        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            long endTime = System.nanoTime();
            System.out.println("Waktu yang diperlukan untuk faktorialDC(" + n + "): " + (endTime - startTime) + " nanodetik");
            return fakto;
        }
    }
}
