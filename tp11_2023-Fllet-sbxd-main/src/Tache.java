public class Tache implements Comparable<Tache>{
    ///attributs
    private Integer priorite;
    private String dateEcheance;
    private String description;

    /// constructeur
    public Tache(Integer priorite, String dateEcheance, String description) {
        this.priorite = priorite;
        this.dateEcheance = dateEcheance;
        this.description = description;
    }

    ///getters
    public String getDateEcheance() {
        return dateEcheance;
    }

    public String getDescription(){
        return description;
    }

    public Integer getPriorite(){return priorite;}

    ///toString
    @Override
    public String toString() {
        return priorite + " (" + dateEcheance + ") " + description;
    }

    ///compare to method
    @Override
public int compareTo(Tache tache) {
        return this.priorite.compareTo(tache.priorite);
    }



}
