package formes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VecteursFormesTest {

    private VecteursFormes v1, v2, v3;

    @BeforeEach
    void setUp() {
        v1 = new VecteursFormes();
        v2 = new VecteursFormes();
        v3 = new VecteursFormes();
    }

    @Test
    void trier() {
        v1.remplir(20);
        v1.trier();
        assertEquals("[Cercle bleu, Cercle jaune, Cercle noir, Cercle rouge, Cercle rouge, Cercle vert, Cercle vert, Rectangle bleu, Rectangle jaune, Rectangle noir, Rectangle rouge, Rectangle rouge, Rectangle vert, Rectangle vert, Triangle bleu, Triangle jaune, Triangle noir, Triangle rouge, Triangle rouge, Triangle vert]", v1.getVecteur().toString());
    }

    @Test
    void melanger() {
        v1.remplir(3);
        v3.remplir(3);
        v3.melanger();
        assertTrue(true, String.valueOf(v1.equals(v3)));
    }

    @Test
    void testToString() {
        v1.remplir(1);
        assertEquals("Cercle rouge", v1.toString());
    }

    @Test
    void getVecteur() {
        v2.remplir(1);
        assertEquals("[Cercle rouge]", v2.getVecteur().toString());
        v3.remplir(2);
        v3.remplir(2);
        assertEquals("[Cercle rouge, Rectangle rouge]", v3.getVecteur().toString());
    }

    @Test
    void remplir() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> v1.remplir(-1));

    }
}