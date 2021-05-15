package cs.sdp.factory;

public class ConcreteCreatorC extends AbstractCreator {
    @Override
    AbstractProduct createProduct() {
        return new ConcreteProductC();
    }
}
