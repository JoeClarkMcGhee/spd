package cs.sdp.observer;

public class Chris implements Subscriber {
    @Override
    public void notify(Boolean eventState) {
        if (eventState){
            System.out.println("Chris has found that the Event has happened");
        }
    }
}
