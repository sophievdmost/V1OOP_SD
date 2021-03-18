package Practica.practicum8;


public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;

    }

    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;
        if (obj instanceof Voertuig){
            Voertuig andereobj = (Voertuig) obj;

            if (this.type.equals(andereobj.type) &&
                    this.bouwjaar == andereobj.bouwjaar) {

                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }


    public String toString(){
        String str = "Voertuig: " + type + " met bouwjaar: " + bouwjaar + " heeft een waarde van: €"+ String.format("%.2f", huidigeWaarde());
        return str;
    }
}
