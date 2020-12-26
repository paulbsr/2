package ie.bester;

public class Main {

    public static void main(String[] args) {

        // Berekening anchaVenter = new Berekening();
        int principal = (int) Vrae.leesInsette("Hoeveel het jy geleen? ", 1_000, 1_000_000);
        float annualInterest = (float) Vrae.leesInsette("Jaarlikse rentekoers? ", 1, 30);
        byte years = (byte) Vrae.leesInsette("Tydperk (in jare)? ", 1, 30);
        Berekening.opsomming();
        // Berekening.metodeRekenaar();
        // Nommers.metodeRekenaar3();


    }

}