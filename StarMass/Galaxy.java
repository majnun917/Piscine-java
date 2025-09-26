import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new ArrayList<>();
    }


    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject obj) {
        celestialObjects.add(obj);
    }

     public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> result = new HashMap<>();
        result.put("Star", 0);
        result.put("Planet", 0);
        result.put("Other", 0);

        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) {
                result.put("Star", result.get("Star") + obj.getMass());
            } else if (obj instanceof Planet) {
                result.put("Planet", result.get("Planet") + obj.getMass());
            } else {
                result.put("Other", result.get("Other") + obj.getMass());
            }
        }
        return result;
    }
}
