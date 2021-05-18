package cs.sdp.observer;

import java.util.ArrayList;

public class EventManager {

    Boolean hasEventAHappened = false;
    Boolean hasEventBHappened = false;

    ArrayList<Subscriber> eventASubscribers = new ArrayList<>();
    ArrayList<Subscriber> eventBSubscribers = new ArrayList<>();

    void subscribe(Subscriber subscriber, String type){
        if(type.equals("a")){
            eventASubscribers.add(subscriber);
        }
        if(type.equals("b")){
            eventBSubscribers.add(subscriber);
        }
    };
    //void unsubscribe(Subscriber subscriber);

    void notifySubscribers(){
        System.out.println("Has event A happened: " + hasEventAHappened);
        for (Subscriber subscriber : eventASubscribers)
        {
            subscriber.notify(hasEventAHappened);
        }

        System.out.println("Has event B happened: " + hasEventBHappened);
        for (Subscriber subscriber : eventBSubscribers)
        {
            subscriber.notify(hasEventBHappened);
        }
    };

}
