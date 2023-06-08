public class Personne {
    // attributs - A noter que pour les deux derniers attributs, il s’agit d’une instance issue des classes Maison
    //et Voiture respectivement.
    private String nom;
    private String prenom;
    private String adresse;
    private int age;
    private Voiture voiture;
    private Maison maison;

    // constructeurs
    public Personne(String nom, String prenom, String adresse, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.age = age;
        this.voiture = null;
        this.maison = null;
    }

    public Personne(String nom, String prenom, String adresse, int age, Voiture voiture) {
        this(nom, prenom, adresse, age);
        this.voiture = voiture;
    }

    public Personne(String nom, String prenom, String adresse, int age, Maison maison) {
        this(nom, prenom, adresse, age);
        this.maison = maison;
    }

    public Personne(String nom, String prenom, String adresse, int age, Voiture voiture, Maison maison) {
        this(nom, prenom, adresse, age);
        this.voiture = voiture;
        this.maison = maison;
    }

    //Une instance de Personne doit pouvoir être créée de 4 manières différentes :
    // Sans voiture ni maison (vit chez ses parents)
    // Avec une voiture sans maison (vit chez ses parents)
    // Sans voiture avec une maison
    // Avec une voiture et avec une maison
    //Lorsqu’un de ces deux attributs n’est pas utilisé dans le constructeur, il faut mettre sa valeur
    //à null

    //Il doit être possible au moyen de méthodes(fonctions) de changer sur une instance la
    //voiture ou la maison d’une personne.

    //methode
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public void setMaison(Maison maison) {
        this.maison = maison;
    }

}
