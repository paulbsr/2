package ie.bester;

import java.text.NumberFormat;

public class Nommers {
    private static double M = Berekening.getMortgage();
    private static double H = Berekening.getHoofBedrag();


    static NumberFormat nommers = NumberFormat.getCurrencyInstance();
    public static String repayments = nommers.format(M);
    public static String prinsipaal = nommers.format(H);
    public static void metodeRekenaar3() {System.out.println("Maandelikse terugbetalings: " + repayments);}

}
