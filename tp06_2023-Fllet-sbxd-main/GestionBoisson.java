import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class GestionBoisson implements Stockable{

    public List<String[]> chargerData(String path) {
        List<String[]> donnees = new ArrayList<>();
        String[] lignes = FileToStr.lireCsv("stock.csv");

        for (String ligne : lignes) {
            donnees.add(ligne.split("\n"));
        }
        for (String[] ligne : donnees) {
            for (String cellule : ligne) {
                System.out.println(cellule);
            }
        }
        return donnees;
    }

    public static void main(String[] args){
        GestionBoisson gB = new GestionBoisson();
        String localDir = System.getProperty("user.dir");
        gB.chargerData(localDir + File.separator +"src"+ File.separator +"stock.csv");
        System.out.println("------ Affichage du Stock ------- \n");
        gB.afficherStock();
        System.out.println();
        System.out.println("------ Ventes de produits ------- \n");
        Boisson b = new Chocolat("Chocolat",1.5, 25,"au lait");
        gB.servirProduit(b);
        gB.servirProduit(b);
        gB.servirProduit(b);
        System.out.println();
        System.out.println("------ Affichage du Stock ------- \n");
        gB.afficherStock();

    }



    @Override
    public void afficherStock() {


    }

    @Override
    public void servirProduit(Boisson b) {

    }

}
