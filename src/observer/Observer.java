package observer;

public interface Observer {

    // to be called by Observable
    void notify(String message);
}
