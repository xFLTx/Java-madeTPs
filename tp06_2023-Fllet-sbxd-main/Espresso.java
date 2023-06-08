public class Espresso extends Cafe {
    public Espresso(int quantite, String nom, double prix, int taille, int force) {
        super(quantite, nom, prix, taille, force);
    }

    @Override
    public void servir() {
        if (getQuantite() > 0) {
            System.out.println("Voici votre espresso.");
            setQuantite(getQuantite() - 1);
        }
    }
}