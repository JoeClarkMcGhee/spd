package cs.sdp.chain_of_responsibility;

import java.util.ArrayList;

public class ConcreteHandler3 implements Handler_ {

    Handler_ next = null;

    @Override
    public void hasNext(Handler_ handler) {
        this.next = handler;

    }

    @Override
    public void handle(ArrayList<String> data) {
        if(next != null){
            data.add("ConcreteHandler3");
            next.handle(data);
        }
        else {
            data.add("ConcreteHandler3");
            for (String x: data) {
                System.out.println(x);
            }
        }
    }
}
