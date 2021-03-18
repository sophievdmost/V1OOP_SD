package Practica.practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto (String tp, double pr, int jr, String kt){
        super(tp, pr, jr);
        kenteken = kt;
    }

    public double huidigeWaarde(){
        double y = nieuwprijs;
        int jaarnu = LocalDate.now().getYear();
        for (int i = 0; i<(jaarnu - bouwjaar); i++) {
            y *= 0.7;
        }
        return y;
    }

    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;
        if (obj instanceof Auto){
            Auto andereobj = (Auto) obj;

            if (this.kenteken.equals(andereobj.kenteken)) {

                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
