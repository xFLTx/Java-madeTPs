import java.util.Comparator;

public class SortPriorite implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            return ((Tache)o2).getPriorite().compareTo(((Tache)o1).getPriorite()); ///on inverse o1 et o2 pour avoir un ordre decroissant !!!
        }
}
