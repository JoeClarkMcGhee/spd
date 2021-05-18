package cs.sdp.chain_of_responsibility;

import java.util.ArrayList;

public interface Handler_ {
    void hasNext(Handler_ handler);
    void handle(ArrayList<String> data);
}
