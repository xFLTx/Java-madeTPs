import java.util.ArrayList;
import java.util.Random;

///declaration de la classe Livre
public class Livre {
    private String titre;
    private String auteur;
    private int nbPage;
    private ArrayList<Recette> recettes = new ArrayList<>();

    ///constructeur

    public Livre(String titre, String auteur, int nbPage) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPage = nbPage;
    }
    public void ajoutRecette(Recette r){
            recettes.add(r);
    }

    // getters
    public String getTitre() {
        return titre;
    }
    



}

