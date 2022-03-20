package formes;
//420-202 – TP2 – POO II
// Nom : Morin
// Prénom : Olivier
// DA : 2133294

import exceptions.FormeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CercleTest {

    @Test
    void setRayon() {
        Cercle c = new Cercle(10);
        c.setRayon(20);
        assertEquals(20,c.getRayon());
        Cercle c2 = new Cercle(20);
        assertThrows(FormeException.class,()->c2.setRayon(100));
    }

    @Test
    void setCouleur() {
        Cercle c = new Cercle(2);
        c.setCouleur(null);
        assertEquals(Couleur.ROUGE, c.getCouleur());


        Cercle c2 = new Cercle(2);
        c2.setCouleur(Couleur.ORANGE);
        c2.setCouleur(null);
        assertEquals(Couleur.ORANGE, c2.getCouleur());
    }

    @Test
    void getNom() {
        Cercle c = new Cercle(2);
        assertEquals("Cercle", c.getNom());

        assertEquals("rouge",Couleur.ROUGE.getNom());

        Couleur.ROUGE.setNom("mauve");
        assertEquals("mauve",Couleur.ROUGE.getNom());

    }

    @Test
    void calculerSurface() {
        Cercle c = new Cercle(10);
        assertEquals(300, c.calculerSurface());
    }

    @Test
    void calculerPerimetre() {
        Cercle c = new Cercle(5);
        assertEquals(30, c.calculerPerimetre());
    }

    @Test
    void testEquals() {
        Cercle c = new Cercle(22);
        Cercle c2 = new Cercle(22);
        c.setCouleur(Couleur.ROUGE);
        c2.setCouleur(Couleur.ROUGE);
        assertEquals(c,c2);
    }

    @Test
    void testToString() {
        Cercle c = new Cercle(20);
        assertEquals(c.getNom() + " " + c.getCouleur() ,c.toString());
    }
}