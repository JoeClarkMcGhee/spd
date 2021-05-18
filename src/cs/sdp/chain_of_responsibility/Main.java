package cs.sdp.chain_of_responsibility;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Handler_ h1 = new ConcreteHandler1();
        Handler_ h3 = new ConcreteHandler3();

        h1.hasNext(h3);

        ArrayList<String> data = new ArrayList<>();
        h1.handle(data);
    }
}
