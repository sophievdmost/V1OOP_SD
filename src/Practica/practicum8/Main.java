package Practica.practicum8;

public class Main {
    public static void main(String[] arg){
        BedrijfsInvertaris b1 = new BedrijfsInvertaris("Emily", 15000.00);

        Computer pc1 = new Computer("Lenovo", "B3-E9-AB-B1-5A-07", 899.00, 2020 );
        Computer pc2 = new Computer( "Macbook air", "72-2F-04-9D-68-31", 1299, 2019);

        Fiets f1 = new Fiets("Gazelle", 399.90, 2020, 1234678);
        Fiets f2 = new Fiets ("Batavia", 200.00, 2019, 6789012);

        Auto a1 = new Auto("Audi", 1200, 2019, "KN96H");
        Auto a2 = new Auto("Opel", 2900, 2020, "LO829");

        Computer pc3 = new Computer("Acer", "B8-F5-89-49-89-EB", 1000, 2020 );
        Fiets f3 = new Fiets("Gazelle", 900.00, 2021, 4578900);
        Auto a3 = new Auto("Mazda", 1400, 2021, "97HN2");

        b1.schafAan(pc1);
        b1.schafAan(pc2);
        b1.schafAan(pc3);
        b1.schafAan(a1);
        b1.schafAan(a2);
        b1.schafAan(a3);
        b1.schafAan(f1);
        b1.schafAan(f2);
        b1.schafAan(f3);

        System.out.println(b1);


    }
}
