package student.KeepTheChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
     public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> change = new ArrayList<>();
        List<Integer> sortedCoins = new ArrayList<>(coins);
        System.out.println(sortedCoins);
        sortedCoins.sort(Collections.reverseOrder());
        for (int coin : sortedCoins) {
            while (amount >= coin) {
                change.add(coin);
                amount -= coin;
            }
        }
        return change;
    }

     public static void main(String[] args) {
        System.out.println(KeepTheChange.computeChange(18, Set.of(1, 3, 7)));
    }
}
