package cs.foc.factory;

public class ConcreteProductB implements AbstractProduct{
    @Override
    public void doesThing() {
        System.out.println("I've done the B thing");
    }
}
