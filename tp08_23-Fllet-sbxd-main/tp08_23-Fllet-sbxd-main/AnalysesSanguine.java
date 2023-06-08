
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

    //A compléter
}
