package cs.sdp.chain_of_responsibility;

import java.util.ArrayList;

public class ConcreteHandler1 implements Handler_ {

    Handler_ next = null;

    @Override
    public void hasNext(Handler_ handler) {
        this.next = handler;

    }

    @Override
    public void handle(ArrayList<String> data) {
        if(next != null){
            data.add("ConcreteHandler1");
            next.handle(data);
        }
        else {
            data.add("ConcreteHandler1");
            for (String x: data) {
                System.out.println(x);
            }
        }
    }
}
