package Practica.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deleerlingen = new ArrayList<Leerling>(0);

    public Klas(String kC){
        klasCode = kC;
    }
    public void voegLeerlingToe(Leerling l){
        deleerlingen.add(l);

    }
    public void wijzigCijfer(String nm, double newCijfer){
        for(Leerling l : deleerlingen){
            if (l.getNaam().equals(nm)){
                l.setCijfer(newCijfer);
            }
        }
    }
    public ArrayList<Leerling> getLeerlingen(){
        return deleerlingen;
    }

    public int aantalLeerlingen(){
        int size = deleerlingen.size();
        return size;
    }

    public String toString(){
        System.out.println("In klas "+ klasCode + " zitten de volgende leerlingen:");
        for (Leerling l : deleerlingen){
            System.out.println(l);
        }
        return "";
    }
}
