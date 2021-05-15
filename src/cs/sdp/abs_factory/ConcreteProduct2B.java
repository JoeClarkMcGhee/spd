package cs.sdp.abs_factory;

public class ConcreteProduct2B implements Product2{
    @Override
    public void doThing() {
        System.out.println("I am product 2, made by factory B");
    }
}
