package observer.improve;



/**
 * @author EricRaww
 * @create 2021-02-17
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
