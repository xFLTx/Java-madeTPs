public class Chocolat extends Boisson {
    private String typeChocolat;
    private String provenance;

    public Chocolat(int quantite, String nom, double prix, int taille, String typeChocolat, String provenance) {
        super(quantite, nom, prix, taille);
        this.typeChocolat = typeChocolat;
        this.provenance = provenance;
    }

    public String getTypeChocolat() {
        return typeChocolat;
    }

    public void setTypeChocolat(String typeChocolat) {
        this.typeChocolat = typeChocolat;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    @Override
    public void allergie() {
        if (typeChocolat.equals("noir")) {
            System.out.println("Ce chocolat ne contient pas de lactose.");
        } else {
            System.out.println("Ce chocolat contient du lactose.");
        }
    }
}