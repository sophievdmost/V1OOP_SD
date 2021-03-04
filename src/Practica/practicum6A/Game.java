package Practica.practicum6A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releasejaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        naam = nm;
        releasejaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde(){
        ///30% per jaar
        double y = nieuwprijs;
        int jaarnu = LocalDate.now().getYear();
        for (int i = 0; i<(jaarnu - releasejaar); i++) {
            y *= 0.7;
        }
        return y;
    }

    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;
        if (andereObject instanceof Game){
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) &&
                this.releasejaar == andereGame.releasejaar) {

                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString(){
        return naam + ", uitgegeven in " + releasejaar+ "; nieuwprijs: €" +String.format("%.2f",nieuwprijs)+ " nu voor: €" + String.format("%.2f",huidigeWaarde());
    }
}
