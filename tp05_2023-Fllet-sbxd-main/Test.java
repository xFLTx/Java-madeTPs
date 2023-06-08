import java.util.*;

public class Test {
    private static ArrayList<Livre> livres = new ArrayList<>();
    
    public static void chargerData(String path){
        String[] textRecette = FileToStr.lireCsv(path);
        String[] ligne = textRecette[0].split(",");
        Livre l = new Livre(ligne[0],ligne[1], Integer.parseInt(ligne[2]));
        for(int i = 1; i < textRecette.length; i++){
            ligne = textRecette[i].split(",");
            l.ajoutRecette(new Recette(ligne[0],Integer.parseInt(ligne[1]),Integer.parseInt(ligne[2]),Integer.parseInt(ligne[3])));
        }
        livres.add(l);
    }

    ///afficher livres et toutes les recettes de chaque livre
    public static void afficherLivres(){
        for(Livre l : livres){
            System.out.println(l);
            for(Recette r : l.getRecettes()){
                System.out.println(r);
            }
        }
    }

    public static void main(String[] args){
        String localDir = System.getProperty("user.dir");
        chargerData(localDir + "\\src\\livre1.csv");
        chargerData(localDir + "\\src\\livre2.csv");
        afficherLivres();
        genererPlanning();
        afficherPlanning();
        System.out.println("");
        rechercheRecette(new Recette("Jaret de porc",10,2,60));
        rechercheRecette(new Recette("Jaret de boeuf",10,2,60));
        rechercheRecettePlanning(new Recette("Jaret de porc",10,2,60));
    }
}
