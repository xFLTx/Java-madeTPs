//creation class Entreprise avec les champs suivants:
//nom, adresse, type, nbBatiment, domaine, nbEmploye, dirigeant

//cette classe doit avoir les méthodes suivantes:
//changerNbBatiment(int nbBatiment) par une valeur donnée
//changer nbEmploye(int nbEmploye) par une valeur donnée
//une seule methode permettant (avec boolean)
    //un affichage complet: nom de l'entreprise, adresse + entreprise "type" detenue par "detenteur majoritaire" dans le domaine yyyyyy + il y a X batiments pour Y employes
public class Entreprise {
    //les champs
    private String nom;
    private String adresse;
    private String type;
    private int nbBatiment;
    private String domaine;
    private int nbEmploye;
    private String dirigeant;

//le constructeur


    public Entreprise(String nom, String adresse, String type, int nbBatiment, String domaine, int nbEmploye, String dirigeant) {
        this.nom = nom;
        this.adresse = adresse;
        this.type = type;
        this.nbBatiment = nbBatiment;
        this.domaine = domaine;
        this.nbEmploye = nbEmploye;
        this.dirigeant = dirigeant;
    }

    //les méthodes
    // changerNbBatiment(int nbBatiment) par une valeur donnée
    public void changerNbBatiment(int nbBatiment) {
        this.nbBatiment = nbBatiment;
    }

    // changer nbEmploye(int nbEmploye) par une valeur donnée

    public void changerNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }

    //methode avec bool pour afficher nom de l'entreprise, adresse + entreprise "type" detenue par "detenteur majoritaire" dans le domaine yyyyyy + il y a X batiments pour Y employes

    public void afficher (boolean full){
        System.out.println(nom + ", " + adresse);
        if (full) {
            System.out.println("Entreprise " + type + " détenue par " + dirigeant + " dans le domaine " + domaine);
            System.out.println("L'entreprise possède " + nbBatiment + " bâtiments pour " + nbEmploye + " employés");
        }
    }

    // changerType (String type) par une valeur donnée
    public void changerType(String type) {
    this.type = type;
    if (type == "publique") {
        this.dirigeant = "L'Etat";
    }


    }

}
