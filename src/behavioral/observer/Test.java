package behavioral.observer;

import behavioral.observer.observer.Subscriber;
import behavioral.observer.subject.Newsletter;

public class Test {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber("subscriber1");
        Subscriber subscriber2 = new Subscriber("subscriber2");
        Subscriber subscriber3 = new Subscriber("subscriber3");
        Subscriber subscriber4 = new Subscriber("subscriber4");

        Newsletter newsletter = new Newsletter();
        newsletter.registerObserver(subscriber1);
        newsletter.registerObserver(subscriber2);
        newsletter.registerObserver(subscriber3);
        newsletter.registerObserver(subscriber4);

        newsletter.notifyObservers();
        newsletter.unregisterObserver(subscriber1);
    }
}
