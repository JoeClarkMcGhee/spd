package cs.sdp.abs_factory;

public class ConcreteFactoryA implements Factory {
    @Override
    public Product1 getProduct1() {
        return new ConcreteProduct1A();
    }

    @Override
    public Product2 getProduct2() {
        return new ConcreteProduct2A();
    }

}
