public class ScavengerHuntNode {
    String question;
    String answer;
    ScavengerHuntNode next;

    public ScavengerHuntNode(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }
}