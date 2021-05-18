package cs.sdp.observer;

public class Main {
    public static void main(String[] args) {
        EventManager bigCheese = new EventManager();
        Joe j = new Joe();
        Chris c = new Chris();
        bigCheese.subscribe(j, "a");
        bigCheese.subscribe(c, "b");
        bigCheese.subscribe(c, "a");

        bigCheese.notifySubscribers();
        bigCheese.hasEventBHappened= true;
        bigCheese.notifySubscribers();
        bigCheese.hasEventAHappened= true;
        bigCheese.notifySubscribers();
    }
}
