import java.util.Scanner;

public class Tugas2_29 {

    // fungsi untuk menghitung kecepatan
    public static void hitungKecepatan() {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan jarak (Km): ");
        double s = input29.nextDouble();
        
        System.out.print("Masukkan waktu (jam): "); 
        double t = input29.nextDouble();
        
        double v = s / t;
        System.out.println("Kecepatan adalah " + v + " Km/jam");
    }
    
    // fungsi untuk menghitung jarak
    public static void hitungJarak() {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (Km/jam): ");
        double v = input29.nextDouble();
        
        System.out.print("Masukkan waktu (jam): ");
        double t = input29.nextDouble();
        
        double s = v * t;
        System.out.println("Jarak adalah " + s + " Km");
    }
    
    // fungsi untuk menghitung waktu
    public static void hitungWaktu() {
        Scanner input29 = new Scanner(System.in); 
        System.out.print("Masukkan jarak (Km): ");
        double s = input29.nextDouble();
        
        System.out.print("Masukkan kecepatan (km/jam): ");
        double v = input29.nextDouble();
        
        double t = s / v;
        System.out.println("Waktu adalah " + t + " jam");

        input29.close();
    }

    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("|        Program Menghitung Rumus     |");
        System.out.println("=======================================");
        System.out.println("Pilihan rumus :");
        System.out.println("1. Kecepatan (s = v * t)");
        System.out.println("2. Jarak (v = s / t)");
        System.out.println("3. Waktu (t = s / v)");
        System.out.println("=======================================");
        
        System.out.print("Masukkan pilihan rumus anda (1/2/3): ");
        int pilihan = input29.nextInt();
        
        if(pilihan == 1) {
            hitungKecepatan();
        } else if(pilihan == 2) {
            hitungJarak();
        } else if(pilihan == 3) {
            hitungWaktu();
        } else {
            System.out.println("Pilihan tidak valid");
        }
        input29.close();
    }
}
