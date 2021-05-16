package cs.sdp.singleton;

public class Main {
    public static void main(String[] args) {
        Chris c = Chris.newInstance("cannoli");
        Chris cj = Chris.newInstance("cassata");

        c.printDessert();
        cj.printDessert();
    }

}