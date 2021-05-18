package cs.sdp.observer;

public class Joe implements Subscriber {

    @Override
    public void notify(Boolean eventState) {
        if (eventState){
            System.out.println("Joe has found out that the Event has happened");
        }
    }
}
