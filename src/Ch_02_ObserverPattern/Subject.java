package Ch_02_ObserverPattern;

// The Subject (or Publisher) has data that can be observed
// The interface handles adding, deleting, and notify all Observers
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
