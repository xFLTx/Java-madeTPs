public class Note {
    //attributs

    private double resultat;
    private int coefficient;
    private String cours;


    //constructeur
    public Note(String cours, double resultat, int coefficient) {
        this.resultat = resultat;
        this.coefficient = coefficient;
        this.cours = cours;
    }

    // Getters and Setters
    public double getResultat() {
        return resultat;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public String getCours() {
        return cours;
    }


    // Override toString() method to return a string representation of the object.
    @Override
    public String toString(){
        return resultat + " (" + coefficient + ")" + " " + cours;
    }


}
