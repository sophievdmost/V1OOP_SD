package Practica.Practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;


    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }
    public void setGehuurdeAuto(Auto gehuurdeAuto){
        this.gehuurdeAuto = gehuurdeAuto;
    }
    public Auto  getGehuurdeAuto(){
        return gehuurdeAuto;
    }
    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }
    public Klant getHuurder(){
        return huurder;
    }
    public double totaalPrijs(){
        if (gehuurdeAuto == null)
            return 0.0;
        else if (huurder == null)
            return 0.0;
        else
            return (aantalDagen * gehuurdeAuto.getPrijsPerDag()* ((100 - huurder.getKorting()) / 100));
    }

    public String toString(){
        String str = "";
        if (gehuurdeAuto == null)
            str += "er is geen auto bekend";
        else
            str += "autotype: " +gehuurdeAuto+ "";
        if (huurder == null)
            str += " \ner is geen huurder bekend";
        else if (huurder == huurder) {
            str += "\nop de naam van: "+ huurder;
        }
        else
            str += " \ner is geen huurder bekend";
        str += "\nAantal dagen: "+ aantalDagen + " en dat kost " + totaalPrijs();
        return str;

    }
}
