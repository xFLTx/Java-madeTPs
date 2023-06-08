public class Employe {
    // les champs
    private String nom;
    private String prenom;
    private String adresse;
    private String fonction;
    private int anneeDansLEntreprise;
    private int salaireMensuel;

    // le constructeur
    public Employe(String nom, String prenom, String adresse, String fonction, int anneeDansLEntreprise, int salaireMensuel) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.fonction = fonction;
        this.anneeDansLEntreprise = anneeDansLEntreprise;
        this.salaireMensuel = salaireMensuel;
    }

    // les méthodes
    // changerAdresse (String adresse) par une valeur donnée

    public void changerAdresse(String adresse) {
        this.adresse = adresse;
    }

    // changerAnneeDansLEntreprise (int annee) par une valeur donnée
    public void changerAnneeDansLEntreprise(int annee) {
        this.anneeDansLEntreprise = annee;
    }

    // calculBonus() sur son salaire par rapport à son ancienneté dans l'entreprise
        //calcul suivant: salaireMensuel + annnéeDansLEntreprise% de salaireMensuel
    public float calculBonus() {return salaireMensuel + (salaireMensuel /100 )*anneeDansLEntreprise;}

    //affichage complet de l'employé
    public void afficher(){
        System.out.println(nom + ", " + prenom + ", " + adresse + ", " + fonction + ", " + anneeDansLEntreprise + ", " + salaireMensuel);
    }
}
