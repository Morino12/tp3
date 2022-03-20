package formes;
//420-202 – TP2 – POO II
// Nom : Morin
// Prénom : Olivier
// DA : 2133294
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormeTest {


    @Test
    void testEquals() {
        Triangle t = new Triangle(10,20,30);
        t.setCouleur(Couleur.BLEU);
        Triangle t2 = new Triangle(10,20,30);
        t2.setCouleur(Couleur.BLEU);
        assertEquals(true,t.equals(t2));
    }

    @Test
    void compareTo() {
        Triangle t = new Triangle(10,20,30);
        Triangle t2 = new Triangle(10,20,30);

        Forme f = t;
        Forme f2 = t2;
        assertEquals(0,f.compareTo(f2));

    }
}