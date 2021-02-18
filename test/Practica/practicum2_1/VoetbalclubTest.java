package Practica.practicum2_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {
    private Voetbalclub test;

    @BeforeEach
    public void init() {
        System.out.println("init");
        test = new Voetbalclub("FC Test");
    }

    @Test
    void voetbalclubNaamEmptyString() {
        System.out.println("voetbalclubNaamEmptyString");
        Voetbalclub vc = new Voetbalclub("");
        assertEquals("FC", vc.getNaam());
    }

    @Test
    void voetbalclubNaamNull() {
        System.out.println("voetbalclubNaamNull");
        Voetbalclub vc = new Voetbalclub(null);
        assertEquals("FC", vc.getNaam());
    }

    @Test
    void voetbalclubVerwerkW() {
        System.out.println("voetbalclubVerwerkW");
        test.verwerkResultaat('w');
        assertEquals(3, test.aantalPunten());
        assertEquals(1, test.aantalGespeeld());
        assertEquals("FC Test 1 1 0 0 3", test.toString());
    }

    @Test
    void voetbalclubVerwerkG() {
        System.out.println("voetbalclubVerwerkG");
        test.verwerkResultaat('g');
        assertEquals(1, test.aantalPunten());
        assertEquals(1, test.aantalGespeeld());
        assertEquals("FC Test 1 0 1 0 1", test.toString());
    }

    @Test
    void voetbalclubVerwerkV() {
        System.out.println("voetbalclubVerwerkV");
        test.verwerkResultaat('v');
        assertEquals(0, test.aantalPunten());
        assertEquals(1, test.aantalGespeeld());
        assertEquals("FC Test 1 0 0 1 0", test.toString());
    }

    @Test
    void voetbalclubVerwerkFoutieveInput() {
        System.out.println("voetbalclubVerwerkFoutieveInput");
        test.verwerkResultaat('z');
        assertEquals(0, test.aantalPunten());
        assertEquals(0, test.aantalGespeeld());
        assertEquals("FC Test 0 0 0 0 0", test.toString());
    }

    @Test
    void voetbalclubVerwerkMeerdereWedstrijden() {
        System.out.println("voetbalclubVerwerkMeerdereWedstrijden");
        test.verwerkResultaat('w');
        test.verwerkResultaat('v');
        test.verwerkResultaat('v');
        test.verwerkResultaat('w');
        test.verwerkResultaat('g');
        test.verwerkResultaat('g');
        test.verwerkResultaat('g');
        test.verwerkResultaat('w');
        test.verwerkResultaat('v');
        test.verwerkResultaat('w');
        assertEquals(15 ,test.aantalPunten());
        assertEquals(10, test.aantalGespeeld());
    }
}
