package Practica.practicum8;


import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }
    public double huidigeWaarde(){
        double y = aanschafPrijs;
        int jaarnu = LocalDate.now().getYear();
        for (int i = 0; i<(jaarnu - productieJaar); i++) {
            y *= 0.6;
        }
        return y;
    }


    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;
        if (obj instanceof Computer){
            Computer andereobj = (Computer) obj;

            if (this.type.equals(andereobj.type) &&
                    this.productieJaar == andereobj.productieJaar &&
                        this.macAdres.equals(andereobj.macAdres)){

                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString(){
        String str = "Computer: " + type + " met productiejaar: " + productieJaar + " met het macadres: " + macAdres+ " en heeft een waarde van: €"+ String.format("%.2f", huidigeWaarde());
        return str;
    }
}
