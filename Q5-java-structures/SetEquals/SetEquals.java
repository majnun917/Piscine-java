import java.util.Set;

public class SetEquals {
     public static boolean areSetsEqual(Set<String> set1, Set<String> set2) {
        for (String s : set1) {
            if (!set2.contains(s)) return false;
        }
        return true;
    }
}
