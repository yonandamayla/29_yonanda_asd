import java.util.Scanner;

public class ScavengerHunt {
    ScavengerHuntNode head;

    public ScavengerHunt() {
        this.head = null;
    }

    public void addPoint(String question, String answer) {
        
        ScavengerHuntNode newNode = new ScavengerHuntNode(question, answer);

        if (head == null) {
            head = newNode;
        } else {
            ScavengerHuntNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void startHunt() {

        Scanner scanner = new Scanner(System.in);
        ScavengerHuntNode current = head;

        while (current != null) {

            System.out.println("Pertanyaan  : " + current.question);
            System.out.print("Jawaban     : ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(current.answer)) {
                System.out.println("ANDA BENAR!! Silahkan lanjut ke pertanyaan selanjutnya");
                current = current.next;
            } else {
                System.out.println("Sayang sekali jawabanmu salah :( Silahkan coba lagi!)");
            }

            System.out.println();

        }

        System.out.println("SELAMATTT! Kamu Berhasil Menemukan Harta Karun!");
        scanner.close();
        
    }
}