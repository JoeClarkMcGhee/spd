package cs.sdp.abs_factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = ProductLineSelecta.getFactory(args[0]);

        Product1 product1 = factory.getProduct1();
        Product2 product2 = factory.getProduct2();

        product1.doThing();
        product2.doThing();
    }
}
