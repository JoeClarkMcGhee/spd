package cs.sdp.factory;

public class ConcreteCreatorB extends AbstractCreator{
    @Override
    AbstractProduct createProduct() {
        return new ConcreteProductB();
    }
}
