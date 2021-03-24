package Practica.practicum6A;
import java.util.ArrayList;


public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> game = new ArrayList<Game>();


    public Persoon(String nm, double bud){
        naam = nm;
        budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (budget < g.huidigeWaarde()) {
            return false;
        } else if (game.contains(g)) {
            return false;
        } else {
            budget -= g.huidigeWaarde();
            game.add(g);
            return true;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (koper.budget > g.huidigeWaarde()) {
            for (Game spel : game) {
                if (g.equals(spel)) {
                    for (Game spelKoper : koper.game) {
                        if (g.equals(spelKoper))
                            return false;
                    }
                    koper.budget -= g.huidigeWaarde();
                    koper.game.add(g);
                    budget += g.huidigeWaarde();
                    game.remove(g);
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){
        String str = naam+" heeft een budget van €" +String.format("%.2f",budget)+ " en bezit de volgende games:";
        for (Game gam : this.game){
            str += "\n" + gam;
        }
        return str;
    }

}
