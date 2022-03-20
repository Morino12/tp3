package formes;
//420-202 – TP2 – POO II
// Nom : Morin
// Prénom : Olivier
// DA : 2133294
public enum TypeTriangle {
    ISOCELE("isocele"), EQUILATERAL("equilateral"), RECTANGLE("rectangle"), SCALENE("scalene");
    private String type;

    TypeTriangle(String s) {

    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
