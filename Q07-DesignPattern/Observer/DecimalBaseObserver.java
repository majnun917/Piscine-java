import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class DecimalBaseObserver implements NumericBaseObserver {
    private List<String> events = new ArrayList<>();
    
    public void updateState(int state) {
        String decStr = new BigDecimal(state).toPlainString();
        events.add(decStr);
    }

    public List<String> getEvents() {
        return events;
    }
}