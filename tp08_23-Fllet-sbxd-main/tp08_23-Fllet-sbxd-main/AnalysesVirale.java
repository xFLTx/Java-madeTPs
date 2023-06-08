public class AnalysesVirale extends Analyses
{
    private String nomVirus;
    private boolean valeurAnalyse;

    public AnalysesVirale(int analyseID, int patientID, String nomVirus, boolean valeurAnalyse)
    {
        super(analyseID, patientID);
        this.nomVirus = nomVirus;
        this.valeurAnalyse = valeurAnalyse;
    }

	//A compléter
}
