package Practica.practicum9A;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {
    private static double bedrag;
    private static int precisie;
    private static int keerGebruikt;

    public Utils(){
        bedrag = bedrag;
        precisie = precisie;
    }

    public static String euroBedrag(double bedrag){
        keerGebruikt +=1;
        double afronding = Math.round(bedrag*100.00)/100.0;

        String s = "€" + afronding;
        return s;
    }

    public static String euroBedrag(double bedrag, int precisie){
        keerGebruikt += 1;
        BigDecimal afronding = new BigDecimal(bedrag).setScale(precisie, RoundingMode.HALF_EVEN);

        String s = "€" + afronding;
        return s;
    }

    public static int aantalGebruikt(){
        return keerGebruikt;
    }
}
