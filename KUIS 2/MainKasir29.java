import java.util.Scanner;

public class MainKasir29 {
    public static void main(String[] args) {
        MinimarketManager29 manager = new MinimarketManager29();
        manager.addDummyData();
        System.out.println("============================================");
        System.out.println("            WELCOME TO MINIMARKET           ");
        System.out.println("============================================");
        manager.printAllBarang();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Barang\n2. Delete Barang\n3. Update Stok\n4. Sort Barang (By Price Asc) \n5. Show All Barang\n6. Exit");
            System.out.print("Enter choice (1 - 6): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Code: ");
                    String kode = scanner.nextLine();
                    System.out.print("Name: ");
                    String nama = scanner.nextLine();
                    System.out.print("Price : ");
                    double harga = scanner.nextDouble();
                    System.out.print("Stock: ");
                    int stok = scanner.nextInt();
                    manager.addBarang(new Barang29(kode, nama, harga, stok));
                    break;
                case 2:
                    System.out.print("Enter code to delete: ");
                    kode = scanner.nextLine();
                    manager.deleteBarang(kode);
                    break;
                case 3:
                    System.out.print("Enter code to update stock: ");
                    kode = scanner.nextLine();
                    System.out.print("Enter new stock: ");
                    stok = scanner.nextInt();
                    manager.updateStok(kode, stok);
                    break;
                case 4:
                    manager.sortBarang();
                    System.out.println("Barang sorted by price");
                    break;
                case 5:
                    manager.printAllBarang();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again");
            }
        } while (choice != 6);

        scanner.close();
    }
}