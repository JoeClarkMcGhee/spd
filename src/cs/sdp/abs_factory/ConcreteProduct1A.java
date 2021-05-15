package cs.sdp.abs_factory;

public class ConcreteProduct1A implements Product1{
    @Override
    public void doThing() {
        System.out.println("I am product 1, made by factory A");
    }
}
