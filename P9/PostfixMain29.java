import java.util.Scanner;

public class PostfixMain29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekspresi matematika (infix) : ");
        Q = sc29.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix29 post = new Postfix29(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
        sc29.close();
    }
}
