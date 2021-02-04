package Practica.Practicum2;

public class Zwembad{
    private double Breedte;
    private double Lengte;
    private double Diepte;

    public Zwembad(double Bre, double Len, double Diep){
        Breedte = Bre;
        Lengte = Len;
        Diepte = Diep;
    }

    public Zwembad(){

    }
/// start getterding
    public double getBreedte(){
        return Breedte;
    }

    public double getDiepte() {
        return Diepte;
    }

    public double getLengte() {
        return Lengte;
    }
/// start setterding
    public void setBreedte(double Breedte){
        this.Breedte = Breedte;
    }

    public void setDiepte(double diepte) {
        this.Diepte = diepte;
    }

    public void setLengte(double lengte) {
        this.Lengte = lengte;
    }
    public double inhoud(){
        return Breedte*Lengte*Diepte;
    }
/// stringding voor print
    public String toString(){
        return "Dit zwembad is " + Breedte + " meter breed, " + Lengte + " meter lang en " + Diepte + " meter diep.";
    }
}
