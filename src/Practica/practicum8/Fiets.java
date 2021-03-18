package Practica.practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets( String tp, Double pr, int jr, int fnr){
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde(){
        double y = nieuwprijs;
        int jaarnu = LocalDate.now().getYear();
        for (int i = 0; i<(jaarnu - bouwjaar); i++) {
            y *= 0.9;
        }
        return y;
    }


    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;
        if (obj instanceof Fiets){
            Fiets andereobj = (Fiets) obj;

            if (this.framenummer== andereobj.framenummer) {

                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
