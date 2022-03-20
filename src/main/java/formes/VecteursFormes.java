//420-202 – TP3 – POO II
//Nom : Guay, Morin
//Prénom : Anthony, Olivier
//DA : 2038884, 2133294
package formes;

import java.util.*;


public class VecteursFormes implements IVecteurFormes {
    private ArrayList<Forme> tabForme = new ArrayList<Forme>();

    public VecteursFormes() {
    }

    public void trier() {
        for (int i = 0; i < tabForme.size(); i++) {
            for (int j = i + 1; j < tabForme.size(); j++) {
                if (tabForme.get(i).compareTo(tabForme.get(j)) > 0) {
                    permuter(i, j);
                }
            }
        }
    }


    private void permuter(int i1, int i2) {
        Forme temp = tabForme.get(i1);
        tabForme.set(i1, tabForme.get(i2));
        tabForme.set(i2, temp);
    }

    public void melanger() {
        int a = tabForme.size();
        Random rd = new Random();
        for (int i = a - 1; i > 0; i--) {
            int j = rd.nextInt(i + 1);
            permuter(i, j);
        }
    }

    private static boolean validerNbrFormes(int nbrFormes) {
        boolean nbrFormeValide = false;
        if (nbrFormes > 0)
            nbrFormeValide = true;

        return nbrFormeValide;
    }
    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < tabForme.size(); i++) {

            s+= tabForme.get(i).toStringCourt();

        }
        return s;
    }

    @Override
    public ArrayList<Forme> getVecteur() {
        return tabForme;
    }

    private void addForme(Forme f, Couleur c) {
        f.setCouleur(c);
        tabForme.add(f);
    }

    @Override
    public void remplir(int valeur) throws ArrayIndexOutOfBoundsException {
        tabForme.clear();
        int nbrFormes = 0;
        Forme f = null;
        Couleur c = null;
        if (validerNbrFormes(valeur)) {
            while (nbrFormes < valeur) {
                switch (nbrFormes % 3) {
                    case 0:
                        f = new Cercle(4);
                        break;
                    case 1:
                        f = new Rectangle(4, 2);
                        break;
                    case 2:
                        f = new Triangle(3, 4, 5);
                        break;

                }
                switch (nbrFormes % 15) {
                    case 0:
                    case 1:
                    case 2:
                        c = Couleur.values()[0];
                        break;
                    case 3:
                    case 4:
                    case 5:
                        c = Couleur.values()[1];
                        break;
                    case 6:
                    case 7:
                    case 8:
                        c = Couleur.values()[2];
                        break;
                    case 9:
                    case 10:
                    case 11:
                        c = Couleur.values()[3];
                        break;
                    case 12:
                    case 13:
                    case 14:
                        c = Couleur.values()[4];
                        break;
                }
                addForme(f, c);
                nbrFormes++;
            }
        } else
            throw new ArrayIndexOutOfBoundsException("Le nombre de forme est invalide!");
    }


}
