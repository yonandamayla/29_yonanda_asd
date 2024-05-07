public class ScavengerHuntMain {
    public static void main(String[] args) {

        ScavengerHunt scavengerHunt = new ScavengerHunt();

        scavengerHunt.addPoint("Apa yang bisa terbang tanpa sayap dan bisa menangis tanpa mata?", "Awan");
        scavengerHunt.addPoint("Apa yang selalu mengikuti Anda, namun tidak bisa Anda raba?", "Bayangan");
        scavengerHunt.addPoint("Apa yang bisa Anda lihat tetapi tidak bisa Anda dengar?", "Mimpi");

        scavengerHunt.startHunt();
        
    }
}