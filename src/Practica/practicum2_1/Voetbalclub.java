package Practica.practicum2_1;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam){
        this.naam =naam;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public String getNaam() {
        return naam;
    }

    public int aantalPunten() {
        return(aantalGewonnen *3)+(aantalGelijk *1);
    }
    public String toString(){
        return naam +" "+ aantalGespeeld()+ " "+aantalGewonnen  +" " +aantalGelijk + " " +aantalVerloren + " "+ aantalPunten();
    }
}