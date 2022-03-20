package formes;
//420-202 – TP2 – POO II
// Nom : Morin
// Prénom : Olivier
// DA : 2133294
import exceptions.FormeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void calculerSurface() {
        Triangle t = new Triangle(20, 20, 20);
        assertEquals(173, t.calculerSurface());

    }

    @Test
    void calculerPerimetre() {
        Triangle t = new Triangle(20, 20, 20);
        assertEquals(60, t.calculerPerimetre());
    }

    @Test
    void getCoteA() {
        Triangle t = new Triangle(1, 2, 3);
        assertEquals(1, t.getCoteA());
        assertThrows(FormeException.class, () -> new Triangle(100, 20, 30));
    }

    @Test
    void getCoteB() {
        Triangle t = new Triangle(1, 2, 3);
        assertEquals(2, t.getCoteB());
    }

    @Test
    void getCoteC() {
        Triangle t = new Triangle(1, 2, 3);
        assertEquals(3, t.getCoteC());
    }

    @Test
    void getType() {
        Triangle t = new Triangle(15,20,30);
        assertEquals(TypeTriangle.SCALENE,t.getType());
        Triangle t2 = new Triangle(10,10,15);
        assertEquals(TypeTriangle.ISOCELE,t2.getType());
        Triangle t3 = new Triangle(10,10,10);
        assertEquals(TypeTriangle.EQUILATERAL,t3.getType());
    }
    @Test
    void estRectangle(){
        Triangle t = new Triangle(3,4,5);
        TypeTriangle.RECTANGLE.setType("patate");
        assertEquals(TypeTriangle.RECTANGLE.getType(),t.getType().toString());

    }
}