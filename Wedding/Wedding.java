import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Wedding {
     public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
       Map<String, String> w = new HashMap<>();
        int i = 0;
        while (i<first.size() && i<second.size()){
            w.put(first.toArray()[i].toString(), second.toArray()[i].toString());
            i++;
        }
        return w;
    }
}
