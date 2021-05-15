package cs.sdp.abs_factory;

public class ConcreteFactoryB implements Factory {
    @Override
    public Product1 getProduct1() {
        return new ConcreteProduct1B();
    }

    @Override
    public Product2 getProduct2() {
        return new ConcreteProduct2B();
    }
}
