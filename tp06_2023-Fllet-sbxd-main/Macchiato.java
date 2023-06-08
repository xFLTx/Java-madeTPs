public class Macchiato extends Cafe {
    private String provenance;

    public Macchiato(int quantite, String nom, double prix, int taille, int force, String provenance) {
        super(quantite, nom, prix, taille, force);
        this.provenance = provenance;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
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