package formes;

import java.util.Locale;

public enum Couleur {
    ROUGE("rouge"), VERT("vert"), BLEU("bleu"), JAUNE("jaune"), NOIR("noir"), ORANGE("orange");
    private String nom = null;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    Couleur(String nom) {
        this.nom = nom.trim().toLowerCase();
    }

    @Override
    public String toString() {
        return nom;
    }
}
