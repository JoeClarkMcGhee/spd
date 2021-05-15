package cs.sdp.factory;

public class ConcreteProductA implements AbstractProduct{
    @Override
    public void doesThing() {
        System.out.println("I've do the product 'A' thing");
    }
}
