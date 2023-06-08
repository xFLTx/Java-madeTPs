
public class AnalysesSanguine extends Analyses
{
    private String typeAnalyse;
    private int valeurAnalyse;
    private int age;

    
    public AnalysesSanguine(int analyseID, int patientID, String typeAnalyse, int valeurAnalyse, int age)
    {
        super(analyseID, patientID);
        this.typeAnalyse = typeAnalyse;
        this.valeurAnalyse = valeurAnalyse;
        this.age = age;
    }

    //methode is problematic pour verifier si l'analyse est dans la norme ou pas
    public boolean isProblematic(){
        if (valeurAnalyse<160000){
            return true;
        }else if (valeurAnalyse >450000){
            return true;
        }else if (valeurAnalyse > 400000 && age < 16){
            return true;
        }else if (valeurAnalyse > 350000){
            return true;
        }
        return false;

    }

    //methode toString pour afficher les informations de l'analyse
    public String toString(){
        return super.toString()+" Bilan "+typeAnalyse+", valeur "+valeurAnalyse+(isProblematic()?" PAS DANS LA NORME":"");
    }
}
