package Practica.practicum6b;
import java.util.ArrayList;


public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();


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
        } else if (mijnGames.contains(g)) {
            return false;
        } else {
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (koper.budget > g.huidigeWaarde()) {
            for (Game spel : mijnGames) {
                if (g.equals(spel)) {
                    for (Game spelKoper : koper.mijnGames) {
                        if (g.equals(spelKoper))
                            return false;
                    }
                    koper.budget -= g.huidigeWaarde();
                    koper.mijnGames.add(g);
                    budget += g.huidigeWaarde();
                    mijnGames.remove(g);
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){
        String str = naam+" heeft een budget van €" +String.format("%.2f",budget)+ " en bezit de volgende games:";
        for (Game gam : this.mijnGames){
            str += "\n" + gam;
        }
        return str;
    }

    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> games) {
        for (Game gameTest:games) {
            for (Game gameOwned:mijnGames)
         if ( gameOwned.equals(gameTest)) {
             games.remove(gameTest);
         }
        }
        return games;
    }
}
