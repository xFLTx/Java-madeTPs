
public class GestionAnalyses
{

    public static void chargerAnalyses(ArrayList<String[]> fichier)
    {
        //A compléter
    }
    
    public static void afficherAnalyses(){
        //A compléter
    }
    
    public static void main(String[] args){
        String localDir = System.getProperty("user.dir");
        if(System.getProperty("os.name").contains("Windows")){
			System.out.println("----- Chargement du fichier : LstAnalyses.csv -----");
			chargerAnalyses(FileToStr.lireFichier(localDir + "\\src\\LstAnalyses.csv"));
			System.out.println("----- Chargement du fichier : LstAnalyses2.csv  -----");
			chargerAnalyses(FileToStr.lireFichier(localDir + "\\src\\LstAnalyses2.csv" ));
        }else{
			System.out.println("----- Chargement du fichier : LstAnalyses.csv -----");
			chargerAnalyses(FileToStr.lireFichier(localDir + "/src/LstAnalyses.csv"));
			System.out.println("----- Chargement du fichier : LstAnalyses2.csv -----");
			chargerAnalyses(FileToStr.lireFichier(localDir + "/src/LstAnalyses2.csv"));
        }
        System.out.println("");
        afficherAnalyses();
    }
}
