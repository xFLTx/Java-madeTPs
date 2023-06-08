import java.util.Comparator;

public class SortDate implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Tache) o1).getDateEcheance().compareTo(((Tache)o2).getDateEcheance());
    }
}