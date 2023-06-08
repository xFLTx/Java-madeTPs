public class Boisson {
    /// attributs
    private String nom;
    private double prix;
    private int taille;


    /// constructeurs
    public Boisson(String nom, double prix, int taille) {
        this.nom = nom;
        this.prix = prix;
        this.taille = taille;
    }
    
    /// getters
    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }
    
    public int getTaille() {
        return taille;
    }
}

