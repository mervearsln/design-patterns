package observer;

public interface Observable {

     void addObserver(Observer observer);

     void removeObserver(Observer observer);

     //  It informs all the members of users list about the change
     void notifyObserver();
}
