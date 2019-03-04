package Ch_02_ObserverPattern;

// The Observer subscribes to a Subject and updates itself by calling
// the interface's update() method when the Subject's data changes.
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
