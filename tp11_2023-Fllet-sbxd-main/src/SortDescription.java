import java.util.Comparator;

public class SortDescription implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Tache)o1).getDescription().compareTo(((Tache)o2).getDescription());
    }

}
