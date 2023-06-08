public class AnalyseViraleBuilder {
    private int analyseID;
    private int patientID;
    private String nomVirus;
    private boolean valeurAnalyse;

    public AnalyseViraleBuilder setAnalyseID(int analyseID) {
        this.analyseID = analyseID;
        return this;
    }

    public AnalyseViraleBuilder setPatientID(int patientID) {
        this.patientID = patientID;
        return this;
    }

    public AnalyseViraleBuilder setNomVirus(String nomVirus) {
        this.nomVirus = nomVirus;
        return this;
    }

    public AnalyseViraleBuilder setValeurAnalyse(boolean valeurAnalyse) {
        this.valeurAnalyse = valeurAnalyse;
        return this;
    }

    public AnalyseVirale createAnalyseVirale() {
        return new AnalyseVirale(analyseID, patientID, nomVirus, valeurAnalyse);
    }
}