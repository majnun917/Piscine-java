import java.util.ArrayList;
import java.util.List;

class BinaryBaseObserver implements NumericBaseObserver {
    private List<String> events = new ArrayList<>();

    public void updateState(int state) {
        String binStr = Integer.toBinaryString(state);
        this.events.add(binStr);
    }

    public List<String> getEvents() {
        return this.events;
    }
}