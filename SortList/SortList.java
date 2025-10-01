import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static List<Integer> sort(List<Integer> list) {
        if (list == null) return null;
        List<Integer> sorted = list.stream().sorted()
                .collect(Collectors.toList());

        return sorted;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) return null;
        List<Integer> sorted = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return sorted;
    }
}
