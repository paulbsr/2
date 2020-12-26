package ie.bester;

public class Berekening {

    private static int hoofBedrag_P = 268000;
    private static double jaarlikseRenteKoers_R = 3.6;
    private static byte termyn_N = 30;
    private static final byte maandeInJaar = 12;
    private static final byte persentasie = 100;
    private static float maandelikseRenteKoers_R = (float) (jaarlikseRenteKoers_R / persentasie / maandeInJaar);
    private static float verbandTerugBetalings = termyn_N * maandeInJaar;
    private public static double mortgage = hoofBedrag_P * (maandelikseRenteKoers_R * Math.pow(1 + maandelikseRenteKoers_R, verbandTerugBetalings))
            / (Math.pow(1 + maandelikseRenteKoers_R, verbandTerugBetalings) - 1);


    // public static double printNumberOfEmployees() {System.out.println(mortgage);}
    // public double getMortgage() {return mortgage;}
    public static void metodeRekenaar() {System.out.println("Drolkop het te veel geleen!!!!!!!!!!: " + mortgage);}



    }

