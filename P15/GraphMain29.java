/*import java.util.Scanner;

public class GraphMain29 {
    public static void main(String[] args) {
        Graph29 building = new Graph29(6);
        building.addEdge(0, 1, 50);
        building.addEdge(0, 2, 100);
        building.addEdge(1, 3, 70);
        building.addEdge(2, 3, 40);
        building.addEdge(3, 4, 60);
        building.addEdge(4, 5, 80);
        try {
            building.degree(0);
        } catch (Exception e) {
            System.out.println("Exception in degree method: " + e.getMessage());
        }
        try {
            building.printGraph();
        } catch (Exception e) {
            System.out.println("Exception in printGraph method: " + e.getMessage());
        }

        try {
            building.removeEdge(1, 3);
        } catch (Exception e) {
            System.out.println("Exception in removeEdge method: " + e.getMessage());
        }
        try {
            building.printGraph();
        } catch (Exception e) {
            System.out.println("Exception in printGraph method: " + e.getMessage());
        }

        System.out.println("=====================================");
        GraphMatriks29 bdg = new GraphMatriks29(4);
        bdg.makeEdge(0, 1, 50);
        bdg.makeEdge(1, 0, 60);
        bdg.makeEdge(1, 2, 70);
        bdg.makeEdge(2, 1, 80);
        bdg.makeEdge(2, 3, 40);
        bdg.makeEdge(3, 0, 90);
        bdg.printGraph();
        System.out.println();
        System.out.println("Hasil setelah penghapusan edge : ");
        bdg.removeEdge(2, 1);
        bdg.printGraph();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan node asal: ");
        int source = scanner.nextInt();
        System.out.println("Masukkan node tujuan: ");
        int destination = scanner.nextInt();
        if (building.isConnected(source, destination)) {
            System.out.println("Ada jalur dari node " + source + " ke node " + destination);
        } else {
            System.out.println("Tidak ada jalur dari node " + source + " ke node " + destination);
        }

        System.out.println("=====================================");

        // Calculate and print degree, inDegree, and outDegree of each vertex
        for (int i = 0; i < 4; i++) {
            System.out.println("Degree of vertex " + i + ": " + bdg.calculateDegree(i));
            System.out.println("InDegree of vertex " + i + ": " + bdg.calculateInDegree(i));
            System.out.println("OutDegree of vertex " + i + ": " + bdg.calculateOutDegree(i));
        }
    }
}*/

import java.util.Scanner;

public class GraphMain29 {
    public static void main(String[] args) {
        GraphMatriks29 bdg = new GraphMatriks29(4);
        Scanner scanner = new Scanner(System.in);
        int source, destination, weight;

        while (true) {
            System.out.println("=====================================");
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Check Edge");
            System.out.println("6. Exit");
            System.out.println("7. Update Jarak");
            System.out.println("8. Hitung Edge");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan node asal: ");
                    source = scanner.nextInt();
                    System.out.println("Masukkan node tujuan: ");
                    destination = scanner.nextInt();
                    System.out.println("Masukkan bobot: ");
                    weight = scanner.nextInt();
                    bdg.makeEdge(source, destination, weight);
                    break;
                case 2:
                    System.out.println("Masukkan node asal: ");
                    source = scanner.nextInt();
                    System.out.println("Masukkan node tujuan: ");
                    destination = scanner.nextInt();
                    bdg.removeEdge(source, destination);
                    break;
                case 3:
                    System.out.println("Masukkan node: ");
                    source = scanner.nextInt();
                    System.out.println("Degree of vertex " + source + ": " + bdg.calculateDegree(source));
                    System.out.println("InDegree of vertex " + source + ": " + bdg.calculateInDegree(source));
                    System.out.println("OutDegree of vertex " + source + ": " + bdg.calculateOutDegree(source));
                    break;
                case 4:
                    bdg.printGraph();
                    break;
                case 5:
                    System.out.println("Masukkan node asal: ");
                    source = scanner.nextInt();
                    System.out.println("Masukkan node tujuan: ");
                    destination = scanner.nextInt();
                    if (bdg.hasEdge(source, destination)) {
                        System.out.println("Ada edge dari node " + source + " ke node " + destination);
                    } else {
                        System.out.println("Tidak ada edge dari node " + source + " ke node " + destination);
                    }
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    scanner.close();
                    return;
                case 7:
                    System.out.println("Masukkan node asal: ");
                    source = scanner.nextInt();
                    System.out.println("Masukkan node tujuan: ");
                    destination = scanner.nextInt();
                    System.out.println("Masukkan jarak baru: ");
                    int newWeight = scanner.nextInt();
                    bdg.updateJarak(source, destination, newWeight);
                    break;
                case 8:
                    System.out.println("Jumlah edge dalam graf: " + bdg.hitungEdge());
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan coba lagi.");
            }
        }
    }
}
