package observer;

import java.util.ArrayList;
import java.util.List;

public class NoticeObservable implements Observable {

    private List<Observer> observerList = new ArrayList<>();
    private String message = " --> Notice";

    // To add users to announcement
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    // To delete users from announcement
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    // To send message or announcement to users
    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.notify(message);
        }
    }
}