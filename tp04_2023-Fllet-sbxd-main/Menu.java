import java.util.ArrayList;

public class Menu {
    private String nom;
    private int prix;
    private ArrayList<Plat> plats;

    // Constructor
    public Menu(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
        this.plats = new ArrayList<>();
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public ArrayList<Plat> getPlats() {
        return plats;
    }

    // Methods
    public void affichePlats() {
        for (Plat plat : plats) {
            System.out.println(plat.getNom() + " (" + plat.getTypePlat() + ")");
        }
    }

    public void ajouterPlat(Plat plat) {
        if (plats.size() < 5) {
            plats.add(plat);
        } else {
            System.out.println("Erreur : le menu ne peut pas contenir plus que 5 plats.");
        }
    }
}
