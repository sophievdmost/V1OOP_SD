package Practica.practicum9A;

import static Practica.practicum9A.Utils.euroBedrag;

public class Main {
    public static void main(String[] arg){
        double prijs= 3.11314;
        double tweedeprijs= 3.11314;

        System.out.println(euroBedrag(prijs));
        System.out.println(euroBedrag(tweedeprijs, 1));
        System.out.println(Utils.aantalGebruikt());
    }
}
