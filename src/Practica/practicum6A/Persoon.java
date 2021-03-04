package Practica.practicum6A;
import java.util.ArrayList;


public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> Game = new ArrayList<Game>();


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
        } else if (Game.contains(g)) {
            return false;
        } else {
            budget -= g.huidigeWaarde();
            Game.add(g);
            return true;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (koper.budget > g.huidigeWaarde()) {
            for (Game spel : Game) {
                if (g.equals(spel)) {
                    for (Game spelKoper : koper.Game) {
                        if (g.equals(spelKoper))
                            return false;
                    }
                    koper.budget -= g.huidigeWaarde();
                    koper.Game.add(g);
                    budget += g.huidigeWaarde();
                    Game.remove(g);
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){
        String str = naam+" heeft een budget van €" +String.format("%.2f",budget)+ " en bezit de volgende games:";
        for (Game gam : this.Game){
            str += "\n" + gam;
        }
        return str;
    }
}
