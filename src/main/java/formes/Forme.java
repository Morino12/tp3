package formes;

//420-202 – TP2 – POO II
// Nom : Morin
// Prénom : Olivier
// DA : 2133294
public abstract class Forme implements Comparable<Forme> {
    public final static int MIN_VAL = 1;
    public final static int MAX_VAL = 30;
    public final Couleur COULEUR_DEFAUT = Couleur.ROUGE;
    private String nom = null;
    private Couleur couleur;

    public Forme(String nom) {
        this.nom = nom;
        this.couleur = COULEUR_DEFAUT;
    }

    public String getNom() {
        return nom;
    }

    public String toStringCourt() {
        return nom + " " + couleur + "";
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur c) {
        if (c != null)
            this.couleur = c;

    }

    public abstract int calculerSurface();


    public abstract int calculerPerimetre();

    @Override
    public String toString() {
        return nom + " " + couleur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (this.couleur != ((Forme) o).couleur) return false;
        if (this.calculerSurface() != ((Forme) o).calculerSurface()) return false;
        Forme forme = (Forme) o;

        return couleur == forme.couleur;
    }

    @Override
    public int compareTo(Forme o) {
        int iCompare = 0;
        String sCourant = this.nom + this.couleur;
        String sParam = o.nom + o.couleur;

        iCompare = sCourant.toLowerCase().compareTo(sParam.toLowerCase());
        return iCompare;
    }
}
