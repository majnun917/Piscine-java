package ListEquals;

import java.util.List;

public class ExerciseRunner {
     public static void main(String[] args) {
        System.out.println(ListEquals.areListsEqual(null, null));
        System.out.println(ListEquals.areListsEqual(List.of(""), List.of("")));
    }
}
