import observer.NoticeObservable;
import observer.observerInstances.Man;
import observer.observerInstances.Woman;

public class ObserverPattern implements DesignPattern {

  @Override
  public void getPattern() {
    Man man = new Man();
    Woman woman = new Woman();

    NoticeObservable noticeObservable = new NoticeObservable();

    woman.setObservable(noticeObservable);

    noticeObservable.addObserver(man);
    noticeObservable.addObserver(woman);
    noticeObservable.notifyObserver();

    woman.removeObserver();
    noticeObservable.notifyObserver();
  }
}
