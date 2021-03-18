package Practica.practicum8;
import java.util.ArrayList;

public class BedrijfsInvertaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen= new ArrayList<Goed>();

    public BedrijfsInvertaris( String  nm, double bud){
        bedrijfsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g){
        if (budget > g.huidigeWaarde()){
            for (Goed i : alleGoederen){
                if (g.equals(i)){
                    return;
                }
            }if (budget < g.huidigeWaarde()){
                return;
            }else {
                budget -=g.huidigeWaarde();
                alleGoederen.add(g);
            }
        }
    }

    public String toString(){
        StringBuilder str = new StringBuilder("Het bedrijf van Emily begint met een budget van €15000.00 eindigt met een budget van €" + String.format("%.2f", budget)+ "\nEmily's bedrijf heeft de volgende goederen: \n");
        for (Goed g : this.alleGoederen){
            str.append("\n").append(g);
        }

        return str.toString();
    }
}
