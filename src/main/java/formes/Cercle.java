package formes;

import exceptions.FormeException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

//420-202 – TP2 – POO II
// Nom : Morin
// Prénom : Olivier
// DA : 2133294

public class Cercle extends Forme {
    private int rayon;


    public Cercle(int rayon) {
        super("Cercle");
        this.rayon = rayon;
    }


    /**
     * @return La méthode calculerSurface permet comme son nom l'indique de calculer l'aire du cercle précédemment créé. La formule connue de calcul de l'aire d'un
     * cercle sera celle utilisé dans cette méthode. Cette méthode retourne la valeur de l'aire du cercle.
     * @author Olivier Morin
     * @version Tp1
     */
    @Override
    public int calculerSurface() {
        int surfaceDuCercle;
        int rayonAuCarre = rayon * rayon;
        surfaceDuCercle = (int) (Math.round(Math.PI) * rayonAuCarre);

        return surfaceDuCercle;
    }


    /**
     * @return La méthode calculerPerimètre permet comme son nom l'indique de calculer le périmètre du cercle créé et de retourner la-dites valeur.
     * Cette méthode utilise la formule classique de calcul de périmètre du cercle soit 2*PI*rayon.
     * @author Olivier Morin
     * @version Tp1
     */
    @Override
    public int calculerPerimetre() {
        int perimetreCercle;

        perimetreCercle = (int) (2 * Math.round(Math.PI) * rayon);

        return perimetreCercle;
    }


    /**
     * @return La méthode toString est une méthode qui permet de retourner précisemment un objet en fonction des paramêtres entrée dans
     * la-dites méthode. Dans le cas de celle-ci, la méthode retournera dans l'ordre le nom de l'objet, soit "Cercle", sa couleur et son rayon.
     * @author Olivier Morin
     * @version Tp1
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @param rayon Le paramètre rayon donne la taille du rayon du cercle.
     * @return La méthode validerRayon permet de vérifier si le rayon du cercle est bel et bien entre les bornes définies dans les variables d'instances.
     * Cette méthode retourne un boolean qui sera utilisé plus tard.
     * @author Olivier Morin
     * @version Tp1
     */
    private  boolean validerRayon(int rayon) {
        boolean rayonValide = true;

        if (rayon < MIN_VAL || MAX_VAL < rayon)
            rayonValide = false;


        return rayonValide;
    }

    /**
     * @param rayon Le paramètre rayon permettra d'introduire une valeur x de rayon afin de la valider dans la méthode"validerRayon"
     *              La méthode "setRayon" permet d'affecter un rayon valide à l'objet Cercle. Si le rayon n'est pas valide, la méthode lancera une exception
     *              de type FormeException pour indiquer a l'usager que le rayon est incorrect.
     * @author Olivier Morin
     * @version Tp1
     */
    public void setRayon(int rayon) {
        if (validerRayon(rayon))
            this.rayon = rayon;
        else
            throw new FormeException("La valeur du rayon du cercle est en dehors des bornes!");
    }


    /**
     * @return La méthode "getRayon" permet d'acceder a la valeur qu'à au moment du cast de cette méthode le rayon de l'objet. La-dites valeur
     * sera retournée et utiliser dans les méthodes de test particulièrement.
     * @author Olivier Morin
     * @version Tp1
     */
    public int getRayon() {
        return rayon;
    }



}
