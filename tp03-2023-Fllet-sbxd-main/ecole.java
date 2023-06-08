public class ecole {

    // attributs
    private String nom;
    private String adresse;
    private String type;
    private int nbBatiments;
    private String degre;
    private String domaine;
    private int nbEtudiants;

    // constructeur
    public ecole(String nom, String adresse, String type, int nbBatiments, String degre, String domaine, int nbEtudiants) {
        this.nom = nom;
        this.adresse = adresse;
        this.type = type;
        this.nbBatiments = nbBatiments;
        this.degre = degre;
        this.domaine = domaine;
        this.nbEtudiants = nbEtudiants;
    }

    //methodes
    // Cette classe doit posséder les méthodes suivantes :
    // Changer le nombre de bâtiments par une valeur donnée
    // Changer le nombre d'étudiants par une valeur donnée
    // Une méthode toString affichant l’instance comme dans l’exemple de
    // Une méthode equals()
    //o Si les deux écoles comparées sont privées, les attributs comparés seront
    // Nom
    // Adresse
    // Domaine
    //o Sinon
    // Nom
    // Adresse
    // Changer le degré par une valeur donnée :
    //o Si l'école est publique
    // Si le degré est Primaire ou C.O., le domaine est obligatoirement
    //Général

    //methode setBatiments
    public void setNbBatiments(int nbBatiments) {
        this.nbBatiments = nbBatiments;
    }
    //methode setEtudiants
    public void setNbEtudiants(int nbEtudiants) {
        this.nbEtudiants = nbEtudiants;
    }

    // methode toString
    public String toString() {
        return nom +", "+ adresse + "\n" + type + "de degré " + degre + "dans le domaine " + domaine + "\nil y a " + nbBatiments + " batiments pour " + nbEtudiants + " etudiants";
    }

    // methode equals sans utiliser boolean
    public String equals(ecole e) {
        if (this.type == "privee") {
            if (this.nom == e.nom && this.adresse == e.adresse && this.domaine == e.domaine) {
                return e + "\n --------------est égal à ------------------\n" + this + "\n";
            } else {
                return e + "\n --------------n'est pas égal à ------------------\n" + this + "\n";
            }
        } else {
            if (this.nom == e.nom && this.adresse == e.adresse) {
                return e + "\n --------------est égal à ------------------\n" + this + "\n";
            } else {
                return e + "\n --------------n'est pas égal à ------------------\n" + this + "\n";
            }
        }
    }

    // methode setDegre
    public void setDegre(String degre) {
        if (this.type == "publique") {
            if (degre == "Primaire" || degre == "C.O.") {
                this.domaine = "General";
            }
        }
        this.degre = degre;
    }

}
