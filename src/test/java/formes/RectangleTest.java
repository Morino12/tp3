package formes;
//420-202 – TP2 – POO II
// Nom : Morin
// Prénom : Olivier
// DA : 2133294

import exceptions.FormeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void setCouleur() {
        Rectangle r = new Rectangle(2, 20);
        r.setCouleur(Couleur.ORANGE);
        assertEquals(Couleur.ORANGE, r.getCouleur());

        Rectangle r2 = new Rectangle(2, 20);
        r2.setCouleur(Couleur.BLEU);
        r2.setCouleur(null);
        assertEquals(Couleur.BLEU, r2.getCouleur());

    }


    @Test
    void setHauteur() {
        Rectangle r = new Rectangle(2, 20);
        r.setHauteur(21);
        assertTrue(r.getHauteur() >= 1 && r.getHauteur() <= 30);
        Rectangle r2 = new Rectangle(2, 21);
        assertThrows(FormeException.class, () -> r2.setHauteur(40));


    }

    @Test
    void setLargeur() {
        Rectangle r = new Rectangle(2, 20);
        r.setLargeur(22);
        assertTrue(r.getLargeur() >= 1 && r.getLargeur() <= 30);
        Rectangle r2 = new Rectangle(2, 21);
        assertThrows(FormeException.class, () -> r2.setLargeur(40));
    }

    @Test
    void getNom() {
        Rectangle r = new Rectangle(2,20);
        assertEquals("Rectangle", r.getNom());
    }

    @Test
    void calculerSurface() {
        Rectangle r = new Rectangle(20, 25);
        assertEquals(500, r.calculerSurface());
    }

    @Test
    void calculerPerimetre() {
        Rectangle r = new Rectangle(20, 25);
        assertEquals(90, r.calculerPerimetre());
    }

    @Test
    void testEquals() {
        Rectangle r = new Rectangle(2, 20);
        Rectangle r2 = new Rectangle(2, 20);
        assertEquals(r, r2);
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(20, 20);
        assertEquals(r.getNom() + " " + r.getCouleur(), r.toString());
    }
}