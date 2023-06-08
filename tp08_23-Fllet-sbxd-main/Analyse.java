public abstract class Analyse
{
    private int analyseID; 
    private int patientID;

    public Analyse(int analyseID, int patientID)
    {
       this.analyseID = analyseID;
       this.patientID = patientID;
    }
    //getter

    public int getPatientID(){
        return patientID;
    }
    public String toString(){
        return "Analyse "+analyseID+" pour patient"+patientID;
    }

    //equals method true or false
    public boolean equals(Object o){
        return ((Analyse)o).analyseID == analyseID;
    }

    public abstract boolean isProblematic();

}
