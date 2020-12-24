package ie.bester;

public class Main {

    private static double mortgage;

    public static void main(String[] args) {


        int hoofBedrag_P = 300000;
        double jaarlikseRenteKoers_R = 3.0;
        byte termyn_N = 30;
        final byte maandeInJaar = 12;
        final byte persentasie = 100;
        float maandelikseRenteKoers_R = (float) (jaarlikseRenteKoers_R / persentasie / maandeInJaar);
        float verbandTerugBetalings = termyn_N * maandeInJaar;
        double mortgage = hoofBedrag_P * (maandelikseRenteKoers_R * Math.pow(1 + maandelikseRenteKoers_R, verbandTerugBetalings))
                / (Math.pow(1 + maandelikseRenteKoers_R, verbandTerugBetalings) - 1);
        System.out.println(mortgage);
    }
        public static double getMortgage () {
            System.out.println(mortgage);
            return mortgage;
        }


    public static void setMortgage(double mortgage) {
        Main.mortgage = mortgage;
    }
}