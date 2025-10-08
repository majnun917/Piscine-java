import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        if (inventory.containsKey(productId)) {
            return inventory.get(productId);
        }
        return -1;
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> pid = new ArrayList<>();
        for (String key: inventory.keySet()) {
            if (inventory.get(key).equals(price)) {
                pid.add(key);
            }
        }
        return pid;
    }
}