package jeu;

import java.awt.*;
import java.util.ArrayList;

public class JeuMemoire implements IJeuMemoire {
    private int niveau;

    public JeuMemoire() {//TODO

    }

    public ArrayList<Point> jouerOrdi() {//TODO
        return jouerOrdi();
    }

    private Point choisirForme() {//TODO
        return choisirForme();
    }

    private void preparerVecteurFormes() {//TODO

    }

    @Override
    public String toString() {
        return "JeuMemoire{" +
                "niveau=" + niveau +
                '}';
    }

    private void preparerGrilleDeJeu() {//TODO

    }

    public boolean jouerHumain(int ligne, int colonne) {//TODO
        boolean humain = false;

        return humain;
    }

    private String ajouterEspaces(int i, String s) {//TODO
        String str = "";

        return str;
    }

    public void setNiveauPlusUn() {//TODO
        niveau = niveau + 1;
    }

    public String getNomForme(int ligne, int colonne) {//TODO
        String str = "";

        return str;
    }

    @Override
    public int getNiveau() {
        int niveau = this.niveau;
        return niveau;
    }

}
