public class Moto extends Vehicule{
    ///attributs pour une moto
    private int cylindree;

    ///constructeur par défaut
    public Moto( String immatriculation, String marque, String modele, String etat, int cylindree){
        super( immatriculation, marque, modele, etat);
        this.cylindree = cylindree;
    }


    @Override
    public String toString() {
        return "Moto " + cylindree + " cc : " + getMarque() + " " + getModele() + " immatriculèe " + getImmatriculation();
    }


}
