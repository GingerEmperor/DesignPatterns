package Observer;

public interface Subj {
    void registerObserver(Observers observer);
    void removeObserver(Observers observer);
    void uppdateObservers();
}
