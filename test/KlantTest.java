import Practica.Practicum4B.Klant;
import org.junit.jupiter.api.BeforeEach;

public class KlantTest {
    private Klant test;

    @BeforeEach
    public void innit(){
        System.out.println("Klantinnit");
        test = new Klant("joy");
    }


}
