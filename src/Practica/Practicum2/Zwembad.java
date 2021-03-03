package Practica.Practicum2;

public class Zwembad{
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double Bre, double Len, double Diep){
        breedte = Bre;
        lengte = Len;
        diepte = Diep;
    }

    public Zwembad(){

    }
/// start getterding
    public double getBreedte(){
        return breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double getLengte() {
        return lengte;
    }
/// start setterding
    public void setBreedte(double Breedte){
        this.breedte = Breedte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }
    public double inhoud(){
        return breedte*lengte*diepte;
    }
/// stringding voor print
    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang en " + diepte + " meter diep.";
    }
}
