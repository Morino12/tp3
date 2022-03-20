package formes;
//420-202 – TP2 – POO II
// Nom : Morin
// Prénom : Olivier
// DA : 2133294

import exceptions.FormeException;

/**
 * @author Olivier Morin
 * @version Tp1
 */
public class Triangle extends Forme {
    private int coteA, coteB, coteC;

    public Triangle(int cote1, int cote2, int cote3) {
        super("Triangle");
        if (validerCote(cote1))
            this.coteA = cote1;
        if (validerCote(cote2))
            this.coteB = cote2;
        if (validerCote(cote3))
            this.coteC = cote3;

        if (!(estTriangle(cote1, cote2, cote3)))
            System.out.println("Ce n'est pas un triangle");
//            throw new FormeException("Ce n'est pas un triangle");

    }

    /**
     * La classe getCotestries permet d'implémenter les différents cotés d'un triangle dans un tableau qui sera utile plus tard
     *
     * @return cotes
     */
    private int[] getCotesTries() {
        int[] cotes = {this.coteA, this.coteB, this.coteC};
        return cotes;
    }

    /**
     * La méthode estRectangle permet de définir selon certaine condition si l'objet créé  est un triangle rectangle en fonction de la taille de ses cotés avec pytagore.
     *
     * @return true or false dépendant du résutat obtenu
     */
    private boolean estRectangle() {
        boolean estRectangle = false;
        int hypothenuse = 0;
        int[] cathetes = new int[2];
        for (int cotes : getCotesTries()) {
            if (hypothenuse < cotes) {
                hypothenuse = cotes;
            }
        }
        int indice = 0;
        for (int cotes : getCotesTries()) {
            if (hypothenuse > cotes) {
                cathetes[indice++] = cotes;

            }
        }
        if (Math.pow(hypothenuse, 2) == Math.pow(cathetes[0], 2) + Math.pow(cathetes[1], 2)) {
            estRectangle = true;
        }
        return estRectangle;
    }

    /**
     * La méthode TypeTriangle permet de définir de quel type de triangle s'agit l'objet créé.
     *
     * @return La métjode retourne un Type de Triangle.
     */
    public TypeTriangle getType() {
        if (estRectangle())
            return TypeTriangle.RECTANGLE;
        else if (getNbrCoteEgaux() == 3)
            return TypeTriangle.EQUILATERAL;
        else if (getNbrCoteEgaux() == 2)
            return TypeTriangle.ISOCELE;
        else
            return (TypeTriangle.SCALENE);
    }

    /**
     * La méthode getNbrCoteEgaux permet de trouver le nombre de coté égaux dans le triangle créé.
     *
     * @return le nombre de cotés égaux.
     */
    private int getNbrCoteEgaux() {
        int nbrCoteEgaux;
        if (coteA == coteB && coteB == coteC)
            nbrCoteEgaux = 3;
        else if (coteA == coteC || coteA == coteB || coteB == coteC)
            nbrCoteEgaux = 2;
        else
            nbrCoteEgaux = 1;

        return nbrCoteEgaux;
    }

    /**
     * La méthode estTriangle permet de savoir en fonction des cotés de l'objet si c'est un triangle ou non.
     *
     * @param cote1 le premier coté d'un triangle
     * @param cote2 le second coté d'un triangle
     * @param cote3 le troisième coté d'un triangle
     * @return cela retourne true or false en fonction de l'état de l'objet soit un triangle ou non.
     */
    private boolean estTriangle(int cote1, int cote2, int cote3) {

        return (cote1 + cote2 > cote3 && cote2 + cote3 > cote1 && cote3 + cote1 > cote2);
    }

    /**
     * la méthode validerCote permet d'instaurer une limite de taille au coté du triangle et de savoir si la valeur entré est valide.
     *
     * @param cote
     * @return true or false si c'est valide ou non.
     */
    private boolean validerCote(int cote) {
        boolean coteValide;
        if (cote >= MIN_VAL && cote <= MAX_VAL)
            coteValide = true;
        else
            throw new FormeException(" La taille du côté est invalide!");

        return coteValide;
    }

    /**
     * La méthode calculerSurface permet de calculer la surface du triangle a l'aide de la méthode de Héron.
     *
     * @return la surface du triangle.
     */
    @Override
    public int calculerSurface() {
        int halfPerimeter = (coteA + coteB + coteC) / 2;
        double aireTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - coteA) * (halfPerimeter - coteB) * (halfPerimeter - coteC));
        return (int) aireTriangle;
    }

    /**
     * La méthode calculerPerimetre permet de calculer le périmetre du triangle.
     *
     * @return
     */
    @Override
    public int calculerPerimetre() {
        int perimetre = coteA + coteB + coteC;
        return perimetre;
    }

    /**
     * cela permet d'accèder a la valeur cotéA
     *
     * @return
     */
    public int getCoteA() {
        return coteA;
    }

    /**
     * cela permet d'accèder a la valeur cotéB
     *
     * @return
     */
    public int getCoteB() {
        return coteB;
    }

    /**
     * cela permet d'accèder a la valeur cotéC
     *
     * @return
     */
    public int getCoteC() {
        return coteC;
    }


}
