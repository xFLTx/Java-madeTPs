public class Cafe extends Boisson {
    private int lait;

    public Cafe(int quantite, String nom, double prix, int taille, int force) {
        super(quantite, nom, prix, taille, force);
        this.lait = 0;
    }

    public int getLait() {
        return lait;
    }

    public void setLait(int lait) {
        this.lait = lait;
    }

    @Override
    public void allergie() {
        if (getQuantiteLait() > 0 || getQuantiteCreme() > 0) {
            System.out.println("Contient du lactose.");
        }
    }

    @Override
    public void servir() {
        if (getQuantite() > 0) {
            setQuantite(getQuantite() - 1);
        }
    }
}