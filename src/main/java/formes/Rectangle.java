package formes;
//420-202 – TP2 – POO II
// Nom : Morin
// Prénom : Olivier
// DA : 2133294

import exceptions.*;


public class Rectangle extends Forme {

    private int hauteur;
    private int largeur;


    public Rectangle(int hauteur, int largeur) {
        super("Rectangle");
        this.hauteur = hauteur;
        this.largeur = largeur;

    }

    /**
     * @return La méthode calculerSurface permet comme son nom l'indique de calculer l'aire du rectangle précédemment créé. La formule connue de calcul de l'aire d'un
     * rectangle sera celle utilisé dans cette méthode. Cette méthode retourne la valeur de l'aire du rectangle.
     * @author Olivier Morin
     * @version Tp1
     */
    public int calculerSurface() {
        int surfaceDuRectangle = hauteur * largeur;

        return surfaceDuRectangle;
    }

    /**
     * @return La méthode calculerPerimètre permet comme son nom l'indique de calculer le périmètre du rectangle créé et de retourner la-dites valeur.
     * Cette méthode utilise la formule classique de calcul de périmètre du rectangle.
     * @author Olivier Morin
     * @version Tp1
     */
    public int calculerPerimetre() {
        int perimetreDuRectangle = 0;
        int hauteurTotal = 2 * hauteur;
        int largeurTotal = 2 * largeur;
        perimetreDuRectangle = hauteurTotal + largeurTotal;

        return perimetreDuRectangle;
    }

    /**
     * @return La méthode "getHauteur" permet d'accéder à la valeur qu'a, au moment du cast de cette méthode, la hauteur de l'objet. La-dites valeur
     * sera retournée et utiliser dans les méthodes de test particulièrement.
     * @author Olivier Morin
     * @version Tp1
     */
    public int getHauteur() {

        return hauteur;
    }

    /**
     * @return La méthode "getLargeur" permet d'accéder à la valeur qu'a, au moment du cast de cette méthode, la largeur de l'objet. La-dites valeur
     * sera retournée et utiliser dans les méthodes de test particulièrement.
     * @author Olivier Morin
     * @version Tp1
     */
    public int getLargeur() {
        return largeur;
    }


    /**
     * @param largeur Le paramètre largeur permettra d'introduire une valeur x à la largeur afin de la valider dans la méthode"validerLargeur"
     *                La méthode "setLargeur" permet d'affecter une largeur valide à l'objet Rectangle. Si la largeur n'est pas valide, la méthode lancera une exception
     *                de type FormeException pour indiquer a l'usager que la largeur est incorrect.
     * @author Olivier Morin
     * @version Tp1
     */
    public void setLargeur(int largeur) {
        if (validerLargeur(largeur))
            this.largeur = largeur;
        else
            throw new FormeException("La largeur du rectangle est en dehors des bornes!");
    }

    /**
     * @param hauteur Le paramètre hauteur permettra d'introduire une valeur x a la hauteur afin de la valider dans la méthode"validerHauteur"
     *                La méthode "setHauteur" permet d'affecter une hauteur valide à l'objet Rectangle. Si la hauteur n'est pas valide, la méthode lancera une exception
     *                de type FormeException pour indiquer a l'usager que la hauteur est incorrect.
     * @author Olivier Morin
     * @version Tp1
     */
    public void setHauteur(int hauteur) {

        if (validerHauteur(hauteur))
            this.hauteur = hauteur;
        else {

            throw new FormeException("La hauteur du rectangle est en dehors des bornes!");
        }
    }


    /**
     * @param hauteur Le paramètre hauteur donne la valeur d'une des hauteurs du rectangle.
     * @return La méthode validerHauteur permet de vérifier si la hauteur du rectangle est bel et bien entre les bornes définies dans les variables d'instances.
     * Cette méthode retourne un boolean qui sera utilisé plus tard.
     * @author Olivier Morin
     * @version Tp1
     */
    private  boolean validerHauteur(int hauteur) {
        boolean hauteurValide = true;
        if (hauteur < MIN_VAL || MAX_VAL < hauteur)
            hauteurValide = false;

        return hauteurValide;
    }

    /**
     * @param largeur Le paramètre largeur donne la valeur d'une des largeurs du rectangle.
     * @return La méthode validerLargeur permet de vérifier si la largeur du rectangle est bel et bien entre les bornes définies dans les variables d'instances.
     * Cette méthode retourne un boolean qui sera utilisé plus tard.
     * @author Olivier Morin
     * @version Tp1
     */
    private  boolean validerLargeur(int largeur) {
        boolean largeurValide = true;

        if (largeur < MIN_VAL || MAX_VAL < largeur)
            largeurValide = false;


        return largeurValide;
    }


    /**
     * @return La méthode toString est une méthode qui permet de retourner précisemment un objet en fonction des paramêtres entrée dans
     * la-dites méthode. Dans le cas de celle-ci, la méthode retournera dans l'ordre le nom de l'objet, soit "Rectangle", sa couleur, sa hauteur et sa largeur.
     * @author Olivier Morin
     * @version Tp1
     */
    @Override
    public String toString() {
        return super.toString();
    }


}
