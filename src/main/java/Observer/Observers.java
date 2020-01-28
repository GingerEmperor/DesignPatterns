package Observer;

public interface Observers {
    void uppdate(double temperature,double humidity,double pressure);
    void beObserver(Subj subj);
    void beFree();

}
