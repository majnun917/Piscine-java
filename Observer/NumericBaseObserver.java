import java.util.List;

interface NumericBaseObserver {
    public void updateState(int state);

    public List<String> getEvents();
}