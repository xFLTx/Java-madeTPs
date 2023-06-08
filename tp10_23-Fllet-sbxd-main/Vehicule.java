import java.util.Objects;

public class Vehicule {

    ///attributs de cette classe
    private String immatriculation;
    private String marque;
    private String modele;
    private String etat;


    ///constructeur par défaut
    public Vehicule( String immatriculation, String marque, String modele, String etat) {
        this.immatriculation = immatriculation;
        this.marque =  marque;
        this.modele = modele;
        this.etat = etat;

    }

    ///getter pour recuperer les attributs dans les sous classes
    public String getImmatriculation(){
        return this.immatriculation;
    }
    public String getMarque(){
        return this.marque;
    }
    public String getModele(){
        return this.modele;
    }
    public String getEtat(){
        return this.etat;
    }



}
