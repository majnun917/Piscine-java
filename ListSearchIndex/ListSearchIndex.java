import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null)
            return null;
        if (list.lastIndexOf(value) == -1)
            return null;
        return list.lastIndexOf(value);
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null)
            return null;
        if (list.indexOf(value) == -1)
            return null;
        return list.indexOf(value);
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        ArrayList<Integer> ai = new ArrayList<Integer>();
        if (list == null)
            return ai;
        for (int i = 0; i < list.size(); i++) {
            // i = list.indexOf(value);
            if (value.equals(list.get(i))) {
                ai.add(i);
            }
        }
        return ai;
    }
}
