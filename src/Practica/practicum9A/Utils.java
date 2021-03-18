package Practica.practicum9A;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {
    public double bedrag;
    public int precisie;

    public Utils(){
        bedrag = bedrag;
        precisie = precisie;
    }

    public static String euroBedrag(double bedrag){
        double afronding = Math.round(bedrag*100.00)/100.0;

        String s = "€" + afronding;
        return s;
    }

    public static String euroBedrag(double bedrag, int precisie){
        BigDecimal afronding = new BigDecimal(bedrag).setScale(precisie, RoundingMode.HALF_EVEN);

        String s = "€" + afronding;
        return s;
    }
}
