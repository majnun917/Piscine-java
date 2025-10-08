import java.util.ArrayList;
import java.util.List;

class HexaBaseObserver implements NumericBaseObserver {
    private List<String> events = new ArrayList<>();

    public void updateState(int state) {
        String hexStr = Integer.toHexString(state);
        events.add(hexStr);
    }

    public List<String> getEvents() {
        return events;
    }
}
