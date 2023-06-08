public class Voiture extends Vehicule{
    ///attributs pour une voiture
    private int nbPortes;

    ///constructeur par défaut
    public Voiture(String immatriculation, String marque, String modele, String etat, int nbPortes) {
        super(immatriculation, marque, modele, etat);
        this.nbPortes = nbPortes;
    }


    @Override
    public String toString() {
        return "Voiture " + nbPortes + " portes : " + getMarque() + " " + getModele() + " immatriculèe " + getImmatriculation();
    }
}


