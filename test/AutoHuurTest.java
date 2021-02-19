import Practica.Practicum4B.Auto;
import Practica.Practicum4B.AutoHuur;
import Practica.Practicum4B.Klant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutoHuurtest {
    private Klant test;
    private AutoHuur test2;
    private Auto test3;


    @BeforeEach
    public void innit() {
        System.out.println("Klantinnit");
        Klant test = new Klant("Mevr. Barnes");
        Auto test3 = new Auto("Peugot 207", 50);
    }

    @Test
    public void toStringTest() {
        Auto test3 = new Auto("Peugot 207", 50);
        assertEquals("Peugot 207 met prijs per dag: 50.0", test3.toString());
    }

    @Test
    void kloptPrijsHuurderAuto(){
        System.out.println("kloptPrijsHuurderAuto");
        Auto f1 = new Auto("Peugot 207", 50);
        Klant j = new Klant("Mevr.Barnes");
        AutoHuur d = new AutoHuur();
        d.setAantalDagen(1);
        j.setKorting(10);
        d.setHuurder(j);
        d.setGehuurdeAuto(f1);
        assertEquals(45, d.totaalPrijs());
    }

    @Test
    public void GeenhuurderwelAuto() {
        System.out.println("geenHuurderwelAuto");
        Klant test = new Klant("");
        AutoHuur test2 = new AutoHuur();
        test2.setAantalDagen(0);
        test2.setGehuurdeAuto(test3);
        test2.setHuurder(test);
        assertEquals(0, test2.getAantalDagen());
        assertEquals("", test.toString());
    }
    @Test
    public void GeenHuurderGeenAuto(){
        System.out.println("GeenHuurderGeenAuto");
        Klant test = new Klant("");
        AutoHuur test2 = new AutoHuur();
        test2.setAantalDagen(0);
        test2.setGehuurdeAuto(test3);
        test2.setHuurder(test);
        assertEquals(null, test2.getGehuurdeAuto());
        assertEquals("", test.toString());
    }

    @Test
    public void EenhuurderGeenAuto(){
        System.out.println("EenHuurderGeenAuto");
        Klant test = new Klant("Mevr.Barnes");
        AutoHuur test2 = new AutoHuur();
        test2.setAantalDagen(0);
        test2.setGehuurdeAuto(test3);
        test2.setHuurder(test);
        assertEquals(null, test2.getGehuurdeAuto());
        assertEquals("Mevr.Barnes(korting: 0.0%)", test.toString());
    }
}