package Practica.practicum6A;

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
        return(nieuwprijs * 0.7);
    }

    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;
        if (andereObject instanceof Game){
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) &&
                this.nieuwprijs == andereGame.nieuwprijs &&
                this.releasejaar == andereGame.releasejaar) {

                gelijkeObjecten = true;
            }
        } return gelijkeObjecten;
    }

    public String toString(){
        return naam + ", uitgegeven in " + releasejaar+ "; nieuwprijs: €" +String.format("%.2f",nieuwprijs)+ " nu voor: €" + String.format("%.2f",huidigeWaarde()) + "\n";
    }
}
