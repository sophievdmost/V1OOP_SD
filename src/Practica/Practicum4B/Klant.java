package Practica.Practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String naam){
        this.naam=naam;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    public double getKorting() {
        if (kortingsPercentage < 0){
            return 0;
        }else
        return kortingsPercentage;
    }

    public String toString(){
        if (naam == "")
                return naam;
        if (naam == null)
                return naam;
        else
            return naam + ("(korting: " + getKorting() + "%)");
    }
}
