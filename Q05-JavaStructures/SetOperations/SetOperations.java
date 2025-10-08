
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        if (set1 == null || set2 == null) return null;
        set1.addAll(set2);
        return set1;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        if (set1 == null || set2 == null) return null;
        set1.retainAll(set2);
        return set1;
    }
}
