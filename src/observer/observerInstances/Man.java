package observer.observerInstances;

import observer.Observable;
import observer.Observer;

public class Man implements Observer {

    private Observable observable;

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void notify(String message) {
        System.out.println("Man" + message);
    }

    public void removeObserver() {
        observable.removeObserver(this);
    }
}