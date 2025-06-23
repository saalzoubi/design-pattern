package behavioral.observer.subject;

import behavioral.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {
    List<Observer> subscribers = new ArrayList<>();
    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        subscribers.forEach(Observer::update);
    }



}
