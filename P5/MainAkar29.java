import java.util.Scanner;

public class MainAkar29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        System.out.print("Masukkan bilangan yang ingin diakarkan: ");
        double bilangan = sc29.nextDouble();

        double akarBruteForce = Akar29.squareRootBF(bilangan);
        System.out.println("Akar menggunakan Brute Force: " + akarBruteForce);

        double akarDivideConquer = Akar29.squareRootDC(bilangan);
        System.out.println("Akar menggunakan Divide Conquer: " + akarDivideConquer);
        sc29.close();
    }
}
